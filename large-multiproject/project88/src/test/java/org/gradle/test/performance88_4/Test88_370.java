package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_370 {
    private final Production88_370 production = new Production88_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}