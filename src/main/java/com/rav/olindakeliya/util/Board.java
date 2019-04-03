package com.rav.olindakeliya.util;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Board {
    private Player player1;
    private Player player2;
    private Integer[] pockets;
    private Player nextPlayer;

    public Board(){
        pockets = new Integer[12];
    }
}
