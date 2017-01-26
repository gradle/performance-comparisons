package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_240 {
    private final Production88_240 production = new Production88_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}