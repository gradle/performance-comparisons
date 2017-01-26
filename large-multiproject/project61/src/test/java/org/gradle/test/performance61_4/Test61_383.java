package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_383 {
    private final Production61_383 production = new Production61_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}