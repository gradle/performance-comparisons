package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_378 {
    private final Production24_378 production = new Production24_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}