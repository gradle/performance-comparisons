package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_408 {
    private final Production3_408 production = new Production3_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}