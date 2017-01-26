package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_451 {
    private final Production89_451 production = new Production89_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}