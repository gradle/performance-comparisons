package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_132 {
    private final Production88_132 production = new Production88_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}