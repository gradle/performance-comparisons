package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_493 {
    private final Production4_493 production = new Production4_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}