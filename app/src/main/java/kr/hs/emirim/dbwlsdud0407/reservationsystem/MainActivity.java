package kr.hs.emirim.dbwlsdud0407.reservationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button butStart,butDone;
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timepick;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chrono=(Chronometer)findViewById(R.id.chrono);
        butStart=(Button)findViewById(R.id.but_start);
        butDone=(Button)findViewById(R.id.but_done);
        radioDate=(RadioButton)findViewById(R.id.radio_date);
        radioTime=(RadioButton)findViewById(R.id.radio_time);
        calView=(CalendarView)findViewById(R.id.calender);
        timepick=(TimePicker)findViewById(R.id.time_pick);
        textResult=(TextView)findViewById(R.id.text_result);
        timepick.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        radioDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);
                timepick.setVisibility(View.INVISIBLE);
            }
        });

        radioTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.INVISIBLE);
                timepick.setVisibility(View.VISIBLE);
            }
        });
    }
}
