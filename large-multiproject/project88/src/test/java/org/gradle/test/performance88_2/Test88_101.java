package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_101 {
    private final Production88_101 production = new Production88_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}