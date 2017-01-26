package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_11 {
    private final Production25_11 production = new Production25_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}