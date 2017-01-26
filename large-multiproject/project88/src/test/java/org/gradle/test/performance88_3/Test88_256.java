package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_256 {
    private final Production88_256 production = new Production88_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}