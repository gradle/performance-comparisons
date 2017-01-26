package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_414 {
    private final Production25_414 production = new Production25_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}