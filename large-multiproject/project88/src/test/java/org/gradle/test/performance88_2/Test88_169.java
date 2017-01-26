package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_169 {
    private final Production88_169 production = new Production88_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}