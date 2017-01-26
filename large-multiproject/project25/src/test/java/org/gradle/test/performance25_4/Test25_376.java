package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_376 {
    private final Production25_376 production = new Production25_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}