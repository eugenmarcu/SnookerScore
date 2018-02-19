package com.example.android.snookerscore;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player = 1;
    int player1Score = 0;
    int player2Score = 0;
    boolean onFoulMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRed = findViewById(R.id.button_red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(1);
            }
        });
        Button buttonBlack = findViewById(R.id.button_black);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(7);
            }
        });
        Button buttonPink = findViewById(R.id.button_pink);
        buttonPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(6);
            }
        });
        Button buttonBlue = findViewById(R.id.button_blue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(5);
            }
        });
        Button buttonYellow = findViewById(R.id.button_yellow);
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(2);
            }
        });
        Button buttonGreen = findViewById(R.id.button_green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(3);
            }
        });
        Button buttonBrown = findViewById(R.id.button_brown);
        buttonBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(4);
            }
        });
        Button buttonFoul4 = findViewById(R.id.button_foul4);
        buttonFoul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoulMode = true;
                addPoints(4);
            }
        });
        Button buttonFoul5 = findViewById(R.id.button_foul5);
        buttonFoul5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoulMode = true;
                addPoints(5);
            }
        });
        Button buttonFoul6 = findViewById(R.id.button_foul6);
        buttonFoul6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoulMode = true;
                addPoints(6);
            }
        });
        Button buttonFoul7 = findViewById(R.id.button_foul7);
        buttonFoul7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFoulMode = true;
                addPoints(7);
            }
        });
        RelativeLayout player1Layout = findViewById(R.id.player_1_layout);
        player1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPlayer1();
            }
        });
        RelativeLayout player2Layout = findViewById(R.id.player_2_layout);
        player2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPlayer2();
            }
        });
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
    }

    public void setPlayer1() {
        player = 1;
        ImageView setPlayerButtonOn = findViewById(R.id.set_player_1);
        setPlayerButtonOn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        ImageView setPlayerButtonOff = findViewById(R.id.set_player_2);
        setPlayerButtonOff.setBackgroundColor(getResources().getColor(R.color.colorAccent));

    }

    public void setPlayer2() {
        player = 2;
        ImageView setPlayerButtonOn = findViewById(R.id.set_player_2);
        setPlayerButtonOn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        ImageView setPlayerButtonOff = findViewById(R.id.set_player_1);
        setPlayerButtonOff.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    public void addPoints(int points) {
        if ((player == 1 && !onFoulMode) || (player == 2 && onFoulMode)) {
            player1Score += points;
            TextView tv = findViewById(R.id.player_1_points);
            tv.setText(String.valueOf(player1Score));
            onFoulMode = false;
        } else {
            player2Score += points;
            TextView tv = findViewById(R.id.player_2_points);
            tv.setText(String.valueOf(player2Score));
            onFoulMode = false;
        }
    }


    public void resetScore() {
        setPlayer1();
        player1Score = 0;
        player2Score = 0;
        TextView tvPlayer1 = findViewById(R.id.player_1_points);
        tvPlayer1.setText(String.valueOf(player1Score));
        TextView tvPlayer2 = findViewById(R.id.player_2_points);
        tvPlayer2.setText(String.valueOf(player2Score));
    }
}
