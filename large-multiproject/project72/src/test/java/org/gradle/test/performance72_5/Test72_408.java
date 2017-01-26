package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_408 {
    private final Production72_408 production = new Production72_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}