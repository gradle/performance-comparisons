package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_118 {
    private final Production88_118 production = new Production88_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}