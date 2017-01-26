package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_120 {
    private final Production25_120 production = new Production25_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}