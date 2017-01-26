package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_120 {
    private final Production88_120 production = new Production88_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}