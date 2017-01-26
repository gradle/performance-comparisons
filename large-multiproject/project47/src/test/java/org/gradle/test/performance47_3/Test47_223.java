package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_223 {
    private final Production47_223 production = new Production47_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}