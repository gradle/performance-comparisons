package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_141 {
    private final Production25_141 production = new Production25_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}