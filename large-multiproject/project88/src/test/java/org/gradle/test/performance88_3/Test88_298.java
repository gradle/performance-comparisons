package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_298 {
    private final Production88_298 production = new Production88_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}