package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_22 {
    private final Production88_22 production = new Production88_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}