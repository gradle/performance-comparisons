package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_378 {
    private final Production21_378 production = new Production21_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}