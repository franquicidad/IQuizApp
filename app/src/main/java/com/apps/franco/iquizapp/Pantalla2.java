package com.apps.franco.iquizapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.apps.franco.iquizapp.R.id.C1;
import static com.apps.franco.iquizapp.R.id.C2;
import static com.apps.franco.iquizapp.R.id.C3;
import static com.apps.franco.iquizapp.R.id.C4;
import static com.apps.franco.iquizapp.R.id.P10C1;
import static com.apps.franco.iquizapp.R.id.P10C2;
import static com.apps.franco.iquizapp.R.id.P10C3;
import static com.apps.franco.iquizapp.R.id.P10C4;
import static com.apps.franco.iquizapp.R.id.P2C1;
import static com.apps.franco.iquizapp.R.id.P2C2;
import static com.apps.franco.iquizapp.R.id.P2C3;
import static com.apps.franco.iquizapp.R.id.P2C4;
import static com.apps.franco.iquizapp.R.id.P4C1;
import static com.apps.franco.iquizapp.R.id.P4C2;
import static com.apps.franco.iquizapp.R.id.P4C3;
import static com.apps.franco.iquizapp.R.id.P4C4;
import static com.apps.franco.iquizapp.R.id.P6C1;
import static com.apps.franco.iquizapp.R.id.P6C2;
import static com.apps.franco.iquizapp.R.id.P6C3;
import static com.apps.franco.iquizapp.R.id.P6C4;
import static com.apps.franco.iquizapp.R.id.P8C1;
import static com.apps.franco.iquizapp.R.id.P8C2;
import static com.apps.franco.iquizapp.R.id.P8C3;
import static com.apps.franco.iquizapp.R.id.P8C4;
import static com.apps.franco.iquizapp.R.id.P9C1;
import static com.apps.franco.iquizapp.R.id.P9C2;
import static com.apps.franco.iquizapp.R.id.P9C3;
import static com.apps.franco.iquizapp.R.id.P9C4;

public class Pantalla2 extends AppCompatActivity {

    private static int numRespuestasCorrectas=0;

    //Pregunta 1
    private RadioButton P1C1;
    private RadioButton P1C2;
    private RadioButton P1C3;
    private RadioButton P1C4;
    //Pregunta 2
    private RadioButton P2C1;
    private RadioButton P2C2;
    private RadioButton P2C3;
    private RadioButton P2C4;
    //Pregunta 3
    private CheckBox P3C1;
    private CheckBox P3C2;
    private CheckBox P3C3;
    private CheckBox P3C4;
    //Pregunta 4
    private RadioButton P4C1;
    private RadioButton P4C2;
    private RadioButton P4C3;
    private RadioButton P4C4;
    //Preguntas 5
    private CheckBox P5C1;
    private CheckBox P5C2;
    private CheckBox P5C3;
    private CheckBox P5C4;
    //Pregunta 6
    private RadioButton P6C1;
    private RadioButton P6C2;
    private RadioButton P6C3;
    private RadioButton P6C4;
    //Pregunta 7
    private RadioButton P7C1;
    private RadioButton P7C2;
    private RadioButton P7C3;
    private RadioButton P7C4;
    //Pregunta 8
    private RadioButton P8C1;
    private RadioButton P8C2;
    private RadioButton P8C3;
    private RadioButton P8C4;
    //Pregunta 9
    private RadioButton P9C1;
    private RadioButton P9C2;
    private RadioButton P9C3;
    private RadioButton P9C4;
    //Pregunta 10
    private RadioButton P10C1;
    private RadioButton P10C2;
    private RadioButton P10C3;
    private RadioButton P10C4;

    private RadioGroup rgP1C1;
    private RadioGroup rgP1C2;

    //Pregunta 1
    private boolean isChoiceP1C1=false;
    private boolean ischoiceP1C2=false;
    private boolean ischoiceP1C3=false;
    private boolean ischoiceP1C4=false;
    //Pregunta 2

    private boolean isChoiceP2C1=false;
    private boolean isChoiceP2C2=false;
    private boolean isChoiceP2C3=false;
    private boolean isChoiceP2C4=false;
    //Pregunta 4

    private boolean isChoiceP4C1=false;
    private boolean isChoiceP4C2=false;
    private boolean isChoiceP4C3=false;
    private boolean isChoiceP4C4=false;
    //Pregunta 6

    private boolean isChoiceP6C1=false;
    private boolean isChoiceP6C2=false;
    private boolean isChoiceP6C3=false;
    private boolean isChoiceP6C4=false;
    //Pregunta 7

    private boolean isChoiceC1=false;
    private boolean isChoiceC2=false;
    private boolean isChoiceC3=false;
    private boolean isChoiceC4=false;
    //Pregunta 8

    private boolean isChoiceP8C1=false;
    private boolean isChoiceP8C2=false;
    private boolean isChoiceP8C3=false;
    private boolean isChoiceP8C4=false;
    //Pregunta 9

    private boolean isChoiceP9C1=false;
    private boolean isChoiceP9C2=false;
    private boolean isChoiceP9C3=false;
    private boolean isChoiceP9C4=false;
    //Pregunta 10

    private boolean isChoiceP10C1=false;
    private boolean isChoiceP10C2=false;
    private boolean isChoiceP10C3=false;
    private boolean isChoiceP10C4=false;


    private RadioGroup.OnCheckedChangeListener P1;
    private RadioGroup.OnCheckedChangeListener P2;
    private RadioGroup.OnCheckedChangeListener P3;
    private RadioGroup.OnCheckedChangeListener P4;
    private RadioGroup.OnCheckedChangeListener P5;
    private RadioGroup.OnCheckedChangeListener P6;
    private RadioGroup.OnCheckedChangeListener P7;
    private RadioGroup.OnCheckedChangeListener P8;
    private RadioGroup.OnCheckedChangeListener P9;
    private RadioGroup.OnCheckedChangeListener P10;

    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        //Initialize RadioButtons

        P1C1=(RadioButton)findViewById(R.id.RB21);
        P1C2=(RadioButton)findViewById(R.id.RB74);
        P1C3=(RadioButton)findViewById(R.id.RB75);
        P1C4=(RadioButton)findViewById(R.id.RB94);

        P2C1=(RadioButton)findViewById(R.id.P2C1);
        P2C2=(RadioButton)findViewById(R.id.P2C2);
        P2C3=(RadioButton)findViewById(R.id.P2C3);
        P2C4=(RadioButton)findViewById(R.id.P2C4);
        //Question 3

        P3C1 = (CheckBox) findViewById(R.id.azulrojo);
        P3C2 = (CheckBox) findViewById(R.id.amarilloverde);
        P3C3 = (CheckBox) findViewById(R.id.amarillorojo);
        P3C4 = (CheckBox) findViewById(R.id.amarillorojo4);//Correct

        P4C1=(RadioButton)findViewById(R.id.P4C1);
        P4C2=(RadioButton)findViewById(R.id.P4C2);
        P4C3=(RadioButton)findViewById(R.id.P4C3);
        P4C4=(RadioButton)findViewById(R.id.P4C4);
        //Question 5

        P5C1 = (CheckBox) findViewById(R.id.cdom1);
        P5C2 = (CheckBox) findViewById(R.id.cdom2);//Correct
        P5C3 = (CheckBox) findViewById(R.id.cdom3);
        P5C4 = (CheckBox) findViewById(R.id.cdom4);

        P6C1=(RadioButton)findViewById(R.id.P6C1);
        P6C2=(RadioButton)findViewById(R.id.P6C2);
        P6C3=(RadioButton)findViewById(R.id.P6C3);
        P6C4=(RadioButton)findViewById(R.id.P6C4);

        P7C1=(RadioButton)findViewById(R.id.C1);
        P7C2=(RadioButton)findViewById(R.id.C2);
        P7C3=(RadioButton)findViewById(R.id.C3);
        P7C4=(RadioButton)findViewById(R.id.C4);

        P8C1=(RadioButton)findViewById(R.id.P8C1);
        P8C2=(RadioButton)findViewById(R.id.P8C2);
        P8C3=(RadioButton)findViewById(R.id.P8C3);
        P8C4=(RadioButton)findViewById(R.id.P8C4);

        P9C1=(RadioButton)findViewById(R.id.P9C1);
        P9C2=(RadioButton)findViewById(R.id.P9C2);
        P9C3=(RadioButton)findViewById(R.id.P9C3);
        P9C4=(RadioButton)findViewById(R.id.P9C4);

        P10C1=(RadioButton)findViewById(R.id.P10C1);
        P10C2=(RadioButton)findViewById(R.id.P10C2);
        P10C3=(RadioButton)findViewById(R.id.P10C3);
        P10C4=(RadioButton)findViewById(R.id.P10C4);

        rgP1C1=(RadioGroup)findViewById(R.id.R1A);
        rgP1C2=(RadioGroup)findViewById(R.id.R2A);


        //Score textview
//        rgP1C1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
//                switch (radioGroup.getId()) {
//                    case R.id.R1A:
//                        ischoiceP1C4 = false;
//                        break;
//
//                    case R.id.R1B:
//                        if (R.id.RB94 == radioButtonId) {
//                            ischoiceP1C4 = false;
//                        }
//                        if (R.id.RB74 == radioButtonId) {
//                            ischoiceP1C4 = true;
//                        }
//                }
//            }
//        });

        P2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R2A:
                        if (R.id.P2C1 == radioButtonId) {
                            isChoiceP2C1 = false;
                        }
                        if (R.id.P2C2 == radioButtonId) {
                            isChoiceP2C2 = false;
                        }
                    case R.id.R2B:
                        if (R.id.P2C3 == radioButtonId) {
                            isChoiceP2C3 = false;
                        }
                        if (R.id.P2C4 == radioButtonId) {
                            isChoiceP2C4 = true;
                        }

                }

            }


        };

        P4 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R4A:
                        if (R.id.P4C1 == radioButtonId) {
                            isChoiceP4C1 = false;
                        }
                        if (R.id.P4C2 == radioButtonId) {
                            isChoiceP4C2 = true;
                        }
                    case R.id.R4B:
                        if (R.id.P4C3 == radioButtonId) {
                            isChoiceP4C3 = false;
                        }
                        if (R.id.P4C4 == radioButtonId) {
                            isChoiceP4C4 = false;
                        }

                }

            }


        };
        P6 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R6A:
                        if (R.id.P6C1 == radioButtonId) {
                            isChoiceP6C1 = false;
                        }
                        if (R.id.P6C2 == radioButtonId) {
                            isChoiceP6C2 = true;
                        }
                    case R.id.R6B:
                        if (R.id.P6C3== radioButtonId) {
                            isChoiceP6C3 = false;
                        }
                        if (R.id.P6C4 == radioButtonId) {
                            isChoiceP6C4 = false;
                        }

                }

            }


        };
        P7 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R7A:
                        if (C1== radioButtonId) {
                            isChoiceC1 = false;
                        }
                        if (C2 == radioButtonId) {
                            isChoiceC2 = false;
                        }
                    case R.id.R7B:
                        if (C3 == radioButtonId) {
                            isChoiceC3 = true;
                        }
                        if (C4 == radioButtonId) {
                            isChoiceC4 = false;
                        }

                }

            }


        };
        P8 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R8A:
                        if (R.id.P8C1== radioButtonId) {
                            isChoiceP8C1 = false;
                        }
                        if (R.id.P8C2 == radioButtonId) {
                            isChoiceP8C2 = false;
                        }
                    case R.id.R8B:
                        if (R.id.P8C3 == radioButtonId) {
                            isChoiceP8C3 = true;
                        }
                        if (R.id.P8C4 == radioButtonId) {
                            isChoiceP8C4 = false;
                        }

                }

            }


        };
        P9 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R9A:
                        if (R.id.P9C1== radioButtonId) {
                            isChoiceP9C1 = false;
                        }
                        if (R.id.P9C2 == radioButtonId) {
                            isChoiceP9C2 = false;
                        }
                    case R.id.R9B:
                        if (R.id.P9C3 == radioButtonId) {
                            isChoiceP9C3 = true;
                        }
                        if (R.id.P9C4 == radioButtonId) {
                            isChoiceP9C4 = false;
                        }

                }

            }


        };
        P10= new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.R10A:
                        if (R.id.P10C1== radioButtonId) {
                            isChoiceP10C1 = false;
                        }
                        if (R.id.P10C2 == radioButtonId) {
                            isChoiceP10C2 = false;
                        }
                    case R.id.R9B:
                        if (R.id.P10C3 == radioButtonId) {
                            isChoiceP10C3 = true;
                        }
                        if (R.id.P10C4 == radioButtonId) {
                            isChoiceP10C4 = false;
                        }

                }

            }


        };
    }
    public void score(int numRespuestasCorrectas) {
        score = (TextView) findViewById(R.id.marcador);
        score.setText("" +numRespuestasCorrectas);
    }
    public int submit(View view){

        //Question 1
        if(rgP1C1.getCheckedRadioButtonId() == -1 && rgP1C2.getCheckedRadioButtonId() == R.id.RB74){
            numRespuestasCorrectas+=1;
        }
        //Question 2
        if(isChoiceP2C2){
            numRespuestasCorrectas+=1;
        }
        //Question 4
        if(isChoiceP4C2){
            numRespuestasCorrectas+=1;
        }
        //Question 6
        if(isChoiceP6C2){
            numRespuestasCorrectas+=1;
        }
        //Question 7
        if(isChoiceC3){
            numRespuestasCorrectas+=1;
        }
        //Question 8
        if(isChoiceP8C3){
            numRespuestasCorrectas+=1;
        }
        //Question 9
        if(isChoiceP9C3){
            numRespuestasCorrectas+=1;
        }
        //Question 10
        if(isChoiceP10C3){
            numRespuestasCorrectas+=1;
        }


        //Question 3

        if(!P3C1.isChecked() && !P3C2.isChecked() && !P3C3.isChecked()&& P3C4.isChecked()) {
            numRespuestasCorrectas += 1;
        }

        //Question 5

        if(!P5C1.isChecked() && P5C2.isChecked() && !P5C3.isChecked()&& !P5C4.isChecked()) {
            numRespuestasCorrectas += 1;
        }


        if(numRespuestasCorrectas>8){
            Toast.makeText(this,"Eres muy inteligente.\nObtuviste un puntaje de:"+numRespuestasCorrectas+"/10",Toast.LENGTH_LONG).show();
        }
        if(numRespuestasCorrectas>5 && numRespuestasCorrectas<8){
            Toast.makeText(this,"Estas en el Promedio de Colombia,Felicidades.\nObtuviste un puntaje de:"+numRespuestasCorrectas+"/10",Toast.LENGTH_LONG).show();
        }
        if(numRespuestasCorrectas>0 && numRespuestasCorrectas<5){
            Toast.makeText(this,"Debes estar pendiente a los detalles y leer Bien.\nObtuviste un puntaje de:"+numRespuestasCorrectas+"/10",Toast.LENGTH_LONG).show();

        }

        score(numRespuestasCorrectas);




        return numRespuestasCorrectas;



    }

    public void Reset(View view){

        P1C1.setChecked(false);
        P1C2.setChecked(false);
        P1C3.setChecked(false);
        P1C4.setChecked(false);

        P2C1.setChecked(false);
        P2C2.setChecked(false);
        P2C3.setChecked(false);
        P2C4.setChecked(false);

        P3C1.setChecked(false);
        P3C2.setChecked(false);
        P3C3.setChecked(false);
        P3C4.setChecked(false);

        P4C1.setChecked(false);
        P4C2.setChecked(false);
        P4C3.setChecked(false);
        P4C4.setChecked(false);

        P5C1.setChecked(false);
        P5C2.setChecked(false);
        P5C3.setChecked(false);
        P5C4.setChecked(false);

        P6C1.setChecked(false);
        P6C2.setChecked(false);
        P6C3.setChecked(false);
        P6C4.setChecked(false);

        P7C1.setChecked(false);
        P7C2.setChecked(false);
        P7C3.setChecked(false);
        P7C4.setChecked(false);

        P8C1.setChecked(false);
        P8C2.setChecked(false);
        P8C3.setChecked(false);
        P8C4.setChecked(false);

        P9C1.setChecked(false);
        P9C2.setChecked(false);
        P9C3.setChecked(false);
        P9C4.setChecked(false);

        P10C1.setChecked(false);
        P10C2.setChecked(false);
        P10C3.setChecked(false);
        P10C4.setChecked(false);




        score(0);
        numRespuestasCorrectas=0;





    }


}
