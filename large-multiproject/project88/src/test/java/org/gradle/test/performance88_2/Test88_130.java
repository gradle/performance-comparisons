package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_130 {
    private final Production88_130 production = new Production88_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}