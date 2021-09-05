package com.denis.model;

import java.util.Arrays;

public enum Group {
    USUAL, PREMIUM, VIP;

    public static boolean contain(String group) {
        return Arrays.stream(Group.values()).
                anyMatch(g -> g
                        .toString()
                        .equals(group)
                );
    }
}
