package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_223 {
    private final Production88_223 production = new Production88_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}