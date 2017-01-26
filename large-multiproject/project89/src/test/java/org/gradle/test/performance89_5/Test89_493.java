package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_493 {
    private final Production89_493 production = new Production89_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}