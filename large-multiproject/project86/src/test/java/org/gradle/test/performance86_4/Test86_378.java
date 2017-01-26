package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_378 {
    private final Production86_378 production = new Production86_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}