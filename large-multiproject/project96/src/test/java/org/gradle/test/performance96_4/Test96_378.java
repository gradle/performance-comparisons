package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_378 {
    private final Production96_378 production = new Production96_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}