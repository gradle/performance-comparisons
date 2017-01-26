package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_378 {
    private final Production39_378 production = new Production39_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}