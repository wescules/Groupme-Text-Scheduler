package com.example.time;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;


import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<String> messages = Arrays.asList("https://img.memecdn.com/happy-420-day-from-alaska_c_7271025.jpg","https://img.memecdn.com/type-titan-420-on-google_c_7262033.jpg","https://img.memecdn.com/420-blaze-it-habibi_o_7248224.jpg","https://img.memecdn.com/elon-must-420_c_7244160.jpg","https://img.memecdn.com/the-all-new-xbox-420_c_5336381.jpg","https://img.memecdn.com/smoke-weed-everyday-420-faggot-blaze-it_c_3819363.jpg","https://img.memecdn.com/420-lunch-special_o_5800975.jpg","https://img.memecdn.com/420_o_7175794.jpg","https://img.memecdn.com/doritos-420_c_3607071.jpg","https://img.memecdn.com/yes-we-can-420-everywhere_o_4115753.jpg","https://img.memecdn.com/420-blaze-it-fgt_c_3452777.jpg","https://img.memecdn.com/what-kind-of-drugs-are-we-testing_c_1336471.jpg","https://img.memecdn.com/420-blaze-it_c_1131360.jpg","https://img.memecdn.com/the-bolt-action-remington-420-can-kill-anime-haters-from-any-distance-fellow-weebs_c_4490165.jpg","https://img.memecdn.com/apparently-marijuana-kills_o_3095739.jpg","https://img.memecdn.com/you-have-no-idea-how-high-i-am-right-now-m8_o_3672783.jpg","https://img.memecdn.com/easter-2014_c_1804143.jpg","https://img.memecdn.com/i-amp-039-m-actually-the-duke-of-dank_c_7273602.jpg","https://img.memecdn.com/murican-problems_c_7271007.jpg","https://img.memecdn.com/blaze-it-faggitzz_c_7229947.jpg","https://img.memecdn.com/hello-there_c_7273763.jpg","https://img.memecdn.com/hunden-aer-soet-i-alla-fall_c_4948921.jpg","https://img.memecdn.com/keep-blazin-amp-039_c_7262980.jpg","https://img.memecdn.com/they-know_c_7266142.jpg","https://img.memecdn.com/getting-zoinked_c_7272391.jpg","https://img.memecdn.com/420-bless-it_o_7258203.jpg","https://img.memecdn.com/they-need-the-cash_c_4068461.jpg","https://img.memecdn.com/farewell-cruel-world_c_7245467.jpg","https://img.memecdn.com/bruhhhhhh_c_5297893.jpg","https://img.memecdn.com/space-x-420_c_7244169.jpg","https://img.memecdn.com/hell-of-a-stuff-back-then-o_o_7258077.jpg","https://img.memecdn.com/420-blaze-it-me-now_c_7200830.jpg","https://img.memecdn.com/i-amp-039-d-buy-it_c_7235363.jpg","https://img.memecdn.com/there-ain-amp-039-t-no-party-like-420-party_o_7230839.jpg","https://img.memecdn.com/first-time_c_7225237.jpg","https://img.memecdn.com/i-see-what-you-did-there_c_5050123.jpg","https://img.memecdn.com/art-of-the-joint-by-tony-greenhand_c_7229260.jpg","https://img.memecdn.com/is-it-cool_c_7217214.jpg","https://img.memecdn.com/nigga-you-high-pitched_c_4519085.jpg","https://img.memecdn.com/he-just-wouldn-amp-039-t-die_c_7216169.jpg","https://img.memecdn.com/smoke-wumpas-everyday_c_7230217.jpg","https://img.memecdn.com/how-to-get-in-touch-with-the-universe-smoke-the_c_7223009.jpg","https://img.memecdn.com/420_c_4606635.jpg","https://img.memecdn.com/420-blaze-it_c_7194678.jpg","https://img.memecdn.com/heck-yeah-this-is-my-kind-of-movie_o_3987537.jpg","https://img.memecdn.com/this-is-going-to-table-420_c_7190374.jpg","https://img.memecdn.com/smoke-weed-everyday_c_5433247.jpg","https://img.memecdn.com/i-amp-039-d-go-with-jennifer-420_c_7228764.jpg","https://img.memecdn.com/thoughts-are-scary_c_4840585.jpg","https://img.memecdn.com/420-say-dank-memes-are-dank_c_6493333.jpg","https://img.memecdn.com/kids-these-day-don-amp-039-t-know-what-a-true-console-wars-was-like_c_5333539.jpg","https://img.memecdn.com/smoking-trees_c_4836249.jpg","https://img.memecdn.com/420-blaze-it_o_6477065.jpg","https://img.memecdn.com/also-nice-temperature-outside_o_5320763.jpg","https://img.memecdn.com/that-whould-be-so-great_c_4715845.jpg","https://img.memecdn.com/i-amp-039-ve-ate-a-brownie-and-i-can-amp-039-t-get-up_c_7169798.jpg","https://img.memecdn.com/dude-weed-lmao-ecks-dee-anime-is-digimon-btw_c_7048187.jpg","https://img.memecdn.com/from-1-to-wiz-khalifa-how-high-are-you-i-amp-039-m-snoop-dogg_c_5585861.jpg","https://img.memecdn.com/shiny-bald-man-roasts-hollywood_c_6753891.jpg","https://img.memecdn.com/a-pot-in-friend-is-a-pot-indeed_o_5167105.jpg","https://img.memecdn.com/half-life-420-confirmed_c_3338593.jpg","https://img.memecdn.com/weed-wars-episode-420_c_5832771.jpg","https://img.memecdn.com/i-heard-he-does-a-good-420-backflip_o_3193131.jpg","https://img.memecdn.com/420-dat-boi_c_6895041.jpg","https://img.memecdn.com/what-have-i-d024ne_c_5215551.jpg","https://img.memecdn.com/weed-however-will-turn-you-into-a-goat-girl_c_6796661.jpg","https://img.memecdn.com/damn-weed-heads_c_6886915.jpg","https://img.memecdn.com/amp-quot-hey-did-you-smell-it-too-guys-amp-quot_c_4252571.jpg","https://img.memecdn.com/what-weed_o_4295267.jpg","https://img.memecdn.com/actually-im-going-to-live-there-too_o_3754973.jpg","https://img.memecdn.com/get-it-huh-huh-do-ya-like-dirnk-shot-hahahahahah-best-joke-2016-wins-420-awards_c_6370659.jpg","https://img.memecdn.com/this-sheep_c_4985733.jpg","https://img.memecdn.com/100-not-the-story-of-my-life-i-swear_o_5899529.jpg","https://img.memecdn.com/421th-reich-when_c_6666191.jpg","https://img.memecdn.com/420-spook-it_c_6988789.jpg","https://img.memecdn.com/mlg-graves-360-no-cigar_c_6668683.jpg","https://img.memecdn.com/may-the-blunts-be-with-you_o_6692393.jpg","https://img.memecdn.com/someone-has-a-really-good-time-in-this-room_c_4230045.jpg","https://img.memecdn.com/what-a-time-to-be-aliv-wait_c_5790753.jpg","https://img.memecdn.com/axiom-420-everything-can-get-worse_c_4603839.jpg","https://img.memecdn.com/let-amp-039-s-go-to-spain_c_5890563.jpg","https://img.memecdn.com/but-officer-if-you-think-about-it-we-are-all-high-as-heaven-right-now_c_6645443.jpg","https://img.memecdn.com/2baddass4me_o_5612851.jpg","https://img.memecdn.com/let-amp-039-s-eat-thai-tonight_c_5907789.jpg","https://img.memecdn.com/in-other-news-my-milk-is-spoiled_c_5131863.jpg","https://img.memecdn.com/child-y-u-no-get-420_o_5110185.jpg","https://img.memecdn.com/and-we-celebrate-it-amp-039-s-birth-every-year-on-april-twentieth_c_6323509.jpg","https://img.memecdn.com/420-blaze-it-khaneeth_o_4001229.jpg","https://img.memecdn.com/le-original-420-blaze-it-title-xd_o_4382911.jpg","https://img.memecdn.com/injecting-420-whole-marihuanas_c_3070989.jpg","https://img.memecdn.com/explains-why-hes-so-calm-under-pressure-with-water-pumps-like-that-i-amp-039-d-swim-everyday-to_o_5728835.jpg","https://img.memecdn.com/420-blaze-it-fegit_o_4412403.jpg","https://img.memecdn.com/blaze-it-mommy_o_3613365.jpg","https://img.memecdn.com/amp-quot-smoke-tree-s-amp-quot-t_c_3178375.jpg","https://img.memecdn.com/the-almighty-joint_c_2007287.jpg","https://img.memecdn.com/getting-high-in-public_c_4715155.jpg","https://img.memecdn.com/this-special-llama-amp-039-s-got-the-best-deals-in-the-zoo_o_5685757.jpg","https://img.memecdn.com/420-blaze-it-fgt-c-amp-039-mon-do-it_c_4338667.jpg","https://img.memecdn.com/i-sold-this-490x653-pixel-jpeg-image-for-420-069-worth-of-dogecoin_o_3780377.jpg","https://img.memecdn.com/i-was-just-walking-down-the-street_c_4415945.jpg");

    Calendar calendar, mutable;
    EditText chooseTime;
    TimePickerDialog timePickerDialog;

    int currentHour;
    int currentMinute;
    String amPm;
    Boolean memeIsOn;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Switch memeswitch = findViewById(R.id.memeswitch);

        memeswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "The Switch is " + (isChecked ? "on" : "off"),
                        Toast.LENGTH_SHORT).show();
                if (isChecked) {
                    //do stuff when Switch is ON
                    Random randomizer = new Random();
                    String random = messages.get(randomizer.nextInt(messages.size()));

                    EditText text = findViewById(R.id.actualtext);
                    text.setText(random);
                    AlertReciever.message = random;
                    memeIsOn = true;
                    AlertReciever.memeSwitchIsOn = true;
                } else {
                    //do stuff when Switch if OFF
                    AlertReciever.memeSwitchIsOn = false;
                    memeIsOn = false;
                    EditText text = findViewById(R.id.actualtext);
                    AlertReciever.message = text.getText().toString();
                }
            }
        });
        chooseTime =  findViewById(R.id.timeid);
        chooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                        if (hourOfDay >= 12) {
                            amPm = "PM";
                        } else {
                            amPm = "AM";
                        }
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        c.set(Calendar.MINUTE, minutes);
                        c.set(Calendar.SECOND, 0);

                        mutable = c;

                        chooseTime.setText(String.format("%02d:%02d", hourOfDay, minutes) + amPm);
                    }
                }, currentHour, currentMinute, false);

                timePickerDialog.show();
            }
        });


        Button submit = findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_LONG).show();

                startAlarm(mutable);
            }
        });


    }

    private void startAlarm(Calendar c){
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlertReciever.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 0);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(),
                AlarmManager.INTERVAL_HALF_DAY, pendingIntent);
    }

}

