package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_383 {
    private final Production27_383 production = new Production27_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}