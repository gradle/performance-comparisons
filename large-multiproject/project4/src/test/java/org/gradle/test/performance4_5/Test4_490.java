package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_490 {
    private final Production4_490 production = new Production4_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}