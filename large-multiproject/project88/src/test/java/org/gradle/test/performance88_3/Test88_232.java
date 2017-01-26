package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_232 {
    private final Production88_232 production = new Production88_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}