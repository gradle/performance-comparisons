package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_408 {
    private final Production8_408 production = new Production8_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}