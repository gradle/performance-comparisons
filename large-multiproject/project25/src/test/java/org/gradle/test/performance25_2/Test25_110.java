package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_110 {
    private final Production25_110 production = new Production25_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}