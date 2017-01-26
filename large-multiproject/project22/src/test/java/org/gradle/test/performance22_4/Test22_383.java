package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_383 {
    private final Production22_383 production = new Production22_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}