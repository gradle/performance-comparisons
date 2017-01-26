package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_160 {
    private final Production25_160 production = new Production25_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}