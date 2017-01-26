package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_383 {
    private final Production93_383 production = new Production93_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}