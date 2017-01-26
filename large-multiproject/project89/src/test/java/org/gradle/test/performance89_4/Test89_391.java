package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_391 {
    private final Production89_391 production = new Production89_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}