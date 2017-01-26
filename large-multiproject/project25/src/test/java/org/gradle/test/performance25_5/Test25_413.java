package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_413 {
    private final Production25_413 production = new Production25_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}