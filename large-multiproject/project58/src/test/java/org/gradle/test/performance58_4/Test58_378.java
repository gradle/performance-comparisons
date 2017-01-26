package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_378 {
    private final Production58_378 production = new Production58_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}