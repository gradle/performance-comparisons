package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_335 {
    private final Production89_335 production = new Production89_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}