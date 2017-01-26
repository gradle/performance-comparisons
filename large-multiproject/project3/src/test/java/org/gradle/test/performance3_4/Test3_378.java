package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_378 {
    private final Production3_378 production = new Production3_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}