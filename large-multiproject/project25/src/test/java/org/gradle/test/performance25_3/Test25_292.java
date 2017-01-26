package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_292 {
    private final Production25_292 production = new Production25_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}