package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_378 {
    private final Production30_378 production = new Production30_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}