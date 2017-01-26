package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_391 {
    private final Production25_391 production = new Production25_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}