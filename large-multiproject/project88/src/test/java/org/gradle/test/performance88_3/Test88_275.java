package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_275 {
    private final Production88_275 production = new Production88_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}