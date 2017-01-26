package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_378 {
    private final Production50_378 production = new Production50_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}