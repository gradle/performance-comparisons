package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_240 {
    private final Production25_240 production = new Production25_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}