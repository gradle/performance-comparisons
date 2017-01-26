package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_378 {
    private final Production56_378 production = new Production56_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}