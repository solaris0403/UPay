package com.zeus.upay.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

import com.zeus.upay.R;
import com.zeus.upay.capture.decode.DecodeThread;
import com.zeus.upay.main.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 10/30/15.
 */
public class CaptureResultActivity extends BaseActivity {
    @Bind(R.id.result_image)
    ImageView resultImage;
    @Bind(R.id.result_text)
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captureresult);
        ButterKnife.bind(this);
        Bundle extras = getIntent().getExtras();
        if (null != extras) {
            int width = extras.getInt("width");
            int height = extras.getInt("height");

            LayoutParams lps = new LayoutParams(width, height);
            lps.topMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, getResources().getDisplayMetrics());
            lps.leftMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics());
            lps.rightMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics());

            resultImage.setLayoutParams(lps);

            String result = extras.getString("result");
            resultText.setText(result);

            Bitmap barcode = null;
            byte[] compressedBitmap = extras.getByteArray(DecodeThread.BARCODE_BITMAP);
            if (compressedBitmap != null) {
                barcode = BitmapFactory.decodeByteArray(compressedBitmap, 0, compressedBitmap.length, null);
                // Mutable copy:
                barcode = barcode.copy(Bitmap.Config.RGB_565, true);
            }

            resultImage.setImageBitmap(barcode);
        }
    }
}
