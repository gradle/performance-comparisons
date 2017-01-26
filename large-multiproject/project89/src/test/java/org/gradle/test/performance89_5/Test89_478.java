package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_478 {
    private final Production89_478 production = new Production89_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}