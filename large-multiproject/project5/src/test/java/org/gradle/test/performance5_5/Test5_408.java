package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_408 {
    private final Production5_408 production = new Production5_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}