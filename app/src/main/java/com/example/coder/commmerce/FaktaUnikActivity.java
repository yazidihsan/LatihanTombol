package com.example.coder.commmerce;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FaktaUnikActivity extends AppCompatActivity {
    //Mendeklarasikan variabel View
    public static final String TAG = FaktaUnikActivity.class.getSimpleName();
    private AmbilWarna mAmbilWarna = new AmbilWarna();
    private KumpulanFakta mKumpulanFakta = new KumpulanFakta();
    private TextView mFaktaTextView;
    private Button mTampilkanFaktaButton;
    private RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta_unik);
    // Mengassign View dari file Layout ke variabel
        mFaktaTextView = findViewById(R.id.faktaTextView);
        mTampilkanFaktaButton = findViewById(R.id.lihatFaktaButton);
        mRelativeLayout = findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fakta = mKumpulanFakta.getFakta();
                int warna = mAmbilWarna.getWarna();

            // Update text fakta dengan fakta yang sudah kita tentuan secara dinamis
                mFaktaTextView.setText(fakta);
                mRelativeLayout.setBackgroundColor(warna);
                mTampilkanFaktaButton.setTextColor(warna);

            // Menjalankan toast berhasil
                Log.d(TAG,"Log dari method onClick().");
                // Toast.makeText(FaktaUnikActivity.this, "Berhasil mengganti fakta", Toast.LENGTH_LONG).show();
            }
        };

        mTampilkanFaktaButton.setOnClickListener(listener);
        Log.d(TAG,"Log dari method onCreate().");
        //Toast.makeText(FaktaUnikActivity.this, "Berhasil menjalankan activity", Toast.LENGTH_LONG).show();

    }
}
