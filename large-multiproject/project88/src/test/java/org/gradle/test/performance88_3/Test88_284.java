package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_284 {
    private final Production88_284 production = new Production88_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}