package kr.co.company.gifticon_project3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gift_giving_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_giving);
        setTitle("선물 주기 액티비티");

        Button gift_go = (Button) findViewById(R.id.gift_go);
        gift_go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gift_giving_Activity.this,
                        kr.co.company.gifticon_project.gift_clear.class);
                startActivity(intent);
            }
        });

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(gift_giving_Activity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
