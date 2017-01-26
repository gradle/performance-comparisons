package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_408 {
    private final Production30_408 production = new Production30_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}