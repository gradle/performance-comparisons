package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_11 {
    private final Production88_11 production = new Production88_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}