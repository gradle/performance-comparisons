package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_378 {
    private final Production26_378 production = new Production26_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}