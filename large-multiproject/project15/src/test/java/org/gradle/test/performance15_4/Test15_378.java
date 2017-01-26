package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_378 {
    private final Production15_378 production = new Production15_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}