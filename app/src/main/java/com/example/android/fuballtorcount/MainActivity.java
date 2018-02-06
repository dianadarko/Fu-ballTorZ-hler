package com.example.android.fuballtorcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int zaehlerA = 0;
    int zaehlerB = 0;
    int zaehlerC = 0;
    int zaehlerD = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayToreTeamA(zaehlerA);
        displayFoulsTeamA(zaehlerB);
        displayToreTeamB(zaehlerC);
        displayFoulsTeamB(zaehlerD);
    }

    /**
     * zeigt die anzahl der tore von team a
     */
    public void displayToreTeamA(int z) {
        TextView scoreView = (TextView) findViewById(R.id.anzahlToreTeamA);
        scoreView.setText("Tore: "+String.valueOf(z));
    }

    public void erhoehungToreTeamA(View v) {
        zaehlerA += 1;
        displayToreTeamA(zaehlerA);
    }

    /**
     * zeigt die anzahl der fouls von team a
     */
    public void displayFoulsTeamA(int z) {
        TextView scoreView = (TextView) findViewById(R.id.anzahlFoulTeamA);
        scoreView.setText("Fouls: "+String.valueOf(z));
    }

    public void erhoehungFoulsTeamA(View v) {
        zaehlerB += 1;
        displayFoulsTeamA(zaehlerB);
    }


    /*********************************************************************************/

    /**
     * zeigt die anzahl der tore von team b
     */
    public void displayToreTeamB(int z) {
        TextView scoreView = (TextView) findViewById(R.id.anzahlToreTeamB);
        scoreView.setText("Tore: "+String.valueOf(z));
    }

    public void erhoehungToreTeamB(View v) {
        zaehlerC += 1;
        displayToreTeamB(zaehlerC);
    }

    /**
     * zeigt die anzahl der fouls von team b
     */
    public void displayFoulsTeamB(int z) {
        TextView scoreView = (TextView) findViewById(R.id.anzahlFoulTeamB);
        scoreView.setText("Fouls: "+String.valueOf(z));
    }

    public void erhoehungFoulsTeamB(View v) {
        zaehlerD += 1;
        displayFoulsTeamB(zaehlerD);
    }


    /**
     * der reset button
     */
    public void resetButton(View v) {
        zaehlerA = 0;
        zaehlerB = 0;
        zaehlerC = 0;
        zaehlerD = 0;
        displayToreTeamA(zaehlerA);
        displayFoulsTeamA(zaehlerB);
        displayToreTeamB(zaehlerC);
        displayFoulsTeamB(zaehlerD);

    }

}