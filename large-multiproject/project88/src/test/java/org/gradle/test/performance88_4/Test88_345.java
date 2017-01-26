package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_345 {
    private final Production88_345 production = new Production88_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}