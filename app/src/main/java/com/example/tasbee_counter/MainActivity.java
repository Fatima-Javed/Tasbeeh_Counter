package com.example.tasbee_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int btnNumber = 0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    TextView tv1, tv2;
    int c_TasbihFatima, t_tasbih;
    int c_AyateKarima;
    int c_Darood;
    int c_Astaghfar;
    int c_Kalma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) this.findViewById(R.id.button1);
        btn2 = (Button) this.findViewById(R.id.button2);
        btn3 = (Button) this.findViewById(R.id.button3);
        btn4 = (Button) this.findViewById(R.id.button4);
        btn5 = (Button) this.findViewById(R.id.button5);
        btn6 = (Button) this.findViewById(R.id.button6);
        btn7 = (Button) this.findViewById(R.id.button7);
        tv1 = (TextView) this.findViewById(R.id.textView3);
        tv2 = (TextView) this.findViewById(R.id.textView);


    }

    public void btn1(View view) {
        tv2.setText("سبحان الله");
        btnNumber = 1;
        Toast toast = Toast.makeText(this, "Tasbeeh Fatima Selected", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void btn2(View view) {
        tv2.setText("لَا إِلَٰهَ إِلَّا ٱللَّٰهُ مُحَمَّدٌ رَسُولُ ٱللَّٰهِ");
        btnNumber = 2;
        Toast toast = Toast.makeText(this, "1st Kalma Selected", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btn3(View view) {
        tv2.setText("أَسْتَغْفِرُ ٱللَّٰهَ");
        btnNumber = 3;
        Toast toast = Toast.makeText(this, "Tasbeeh Astagfar Selected", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btn4(View view) {
        tv2.setText("اللَّهُمَّ صل عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ");
        btnNumber = 4;
        Toast toast = Toast.makeText(this, "Tasbeeh Darood Selected", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btn5(View view) {
        tv2.setText("لَّآ إِلَٰهَ إِلَّآ أَنتَ سُبْحَٰنَكَ إِنِّى كُنتُ مِنَ ٱلظَّٰلِمِينَ");
        btnNumber = 5;
        Toast toast = Toast.makeText(this, "Tasbeeh Ayat-e-Karima Selected", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btn6(View view) {
        tv2.setText("Select Tasbeeh");
        tv1.setText("0");
        Toast toast = Toast.makeText(this, "Select Tasbeeh", Toast.LENGTH_SHORT);
        toast.show();
        btnNumber = 0;
        c_TasbihFatima = 0;
        c_AyateKarima = 0;
        c_Darood = 0;
        c_Astaghfar = 0;
        c_AyateKarima = 0;

    }

    public void btn7(View view) {

        switch (btnNumber) {
            case 1: {
//
                if (t_tasbih < 33) {
                    tv2.setText("سبحان الله");
                    c_TasbihFatima++;
                    t_tasbih++;
                    tv1.setText("" + c_TasbihFatima);
                    if (c_TasbihFatima == 33) {
                        c_TasbihFatima = 0;
                    }
                } else if (t_tasbih < 66) {
                    tv2.setText("ٱلْحَمْدُ لِلَّٰهِ");
                    c_TasbihFatima++;
                    t_tasbih++;
                    tv1.setText("" + c_TasbihFatima);
                    if (c_TasbihFatima == 33) {
                        c_TasbihFatima = 0;
                    }
                } else if (t_tasbih < 100) {
                    tv2.setText("الله أكبر");
                    c_TasbihFatima++;
                    t_tasbih++;
                    tv1.setText("" + c_TasbihFatima);
                    if (t_tasbih == 100) {
                        tv2.setText("Select Tasbeeh");
                        c_TasbihFatima = 0;
                        Toast toast = Toast.makeText(this, "Tasbeeh Finished", Toast.LENGTH_SHORT);
                        toast.show();
                        btnNumber = 0;
                        tv1.setText("0");
                        t_tasbih = 0;
                    }

                }

                break;
            }
            case 2: {
                if (c_Kalma >= 100) {
                    tv2.setText("Select Tasbeeh");
                    c_Kalma = 0;
                    Toast toast = Toast.makeText(this, "Tasbeeh Finished", Toast.LENGTH_SHORT);
                    toast.show();
                    btnNumber = 0;
                    tv1.setText("0");
                } else {
                    c_Kalma++;
                    tv1.setText("" + c_Kalma);
                }
                break;
            }
            case 3: {
                if (c_Astaghfar >= 100) {
                    tv2.setText("Select Tasbeeh");
                    c_Astaghfar = 0;
                    Toast toast = Toast.makeText(this, "Tasbeeh Finished", Toast.LENGTH_SHORT);
                    toast.show();
                    btnNumber = 0;
                    tv1.setText("0");
                } else {
                    c_Astaghfar++;
                    tv1.setText("" + c_Astaghfar);
                }
                break;
            }
            case 4: {
                if (c_Darood >= 100) {
                    tv2.setText("Select Tasbeeh");
                    c_Darood = 0;
                    Toast toast = Toast.makeText(this, "Tasbeeh Finished", Toast.LENGTH_SHORT);
                    toast.show();
                    btnNumber = 0;
                    tv1.setText("0");
                } else {
                    c_Darood++;
                    tv1.setText("" + c_Darood);
                }
                break;
            }
            case 5: {
                if (c_AyateKarima >= 100) {
                    tv2.setText("Select Tasbeeh");
                    c_AyateKarima = 0;
                    Toast toast = Toast.makeText(this, "Tasbeeh Finished", Toast.LENGTH_SHORT);
                    toast.show();
                    btnNumber = 0;
                    tv1.setText("0");
                } else {
                    c_AyateKarima++;
                    tv1.setText("" + c_AyateKarima);
                }
                break;
            }

        }
    }

}




