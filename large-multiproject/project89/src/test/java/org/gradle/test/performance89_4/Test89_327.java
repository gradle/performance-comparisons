package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_327 {
    private final Production89_327 production = new Production89_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}