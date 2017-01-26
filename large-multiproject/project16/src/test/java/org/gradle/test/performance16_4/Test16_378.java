package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_378 {
    private final Production16_378 production = new Production16_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}