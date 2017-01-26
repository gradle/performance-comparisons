package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_383 {
    private final Production62_383 production = new Production62_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}