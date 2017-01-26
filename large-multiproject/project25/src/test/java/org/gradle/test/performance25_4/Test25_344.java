package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_344 {
    private final Production25_344 production = new Production25_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}