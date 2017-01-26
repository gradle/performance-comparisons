package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_408 {
    private final Production16_408 production = new Production16_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}