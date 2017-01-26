package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_448 {
    private final Production4_448 production = new Production4_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}