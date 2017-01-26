package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_448 {
    private final Production89_448 production = new Production89_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}