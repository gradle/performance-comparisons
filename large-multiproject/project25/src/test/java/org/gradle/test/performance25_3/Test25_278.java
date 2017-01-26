package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_278 {
    private final Production25_278 production = new Production25_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}