package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_378 {
    private final Production5_378 production = new Production5_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}