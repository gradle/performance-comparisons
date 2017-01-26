package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_487 {
    private final Production89_487 production = new Production89_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}