package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_153 {
    private final Production25_153 production = new Production25_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}