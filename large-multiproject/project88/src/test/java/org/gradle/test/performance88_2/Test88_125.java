package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_125 {
    private final Production88_125 production = new Production88_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}