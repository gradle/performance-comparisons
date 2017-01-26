package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_378 {
    private final Production54_378 production = new Production54_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}