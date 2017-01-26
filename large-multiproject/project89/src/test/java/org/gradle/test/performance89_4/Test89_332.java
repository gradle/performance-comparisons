package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_332 {
    private final Production89_332 production = new Production89_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}