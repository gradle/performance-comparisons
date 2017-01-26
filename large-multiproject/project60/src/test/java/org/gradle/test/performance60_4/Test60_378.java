package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_378 {
    private final Production60_378 production = new Production60_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}