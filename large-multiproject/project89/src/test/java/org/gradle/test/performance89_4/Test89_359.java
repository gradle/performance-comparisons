package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_359 {
    private final Production89_359 production = new Production89_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}