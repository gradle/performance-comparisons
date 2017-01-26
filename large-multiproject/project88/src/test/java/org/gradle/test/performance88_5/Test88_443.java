package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_443 {
    private final Production88_443 production = new Production88_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}