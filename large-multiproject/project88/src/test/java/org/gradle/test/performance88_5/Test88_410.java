package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_410 {
    private final Production88_410 production = new Production88_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}