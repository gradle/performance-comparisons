package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_408 {
    private final Production61_408 production = new Production61_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}