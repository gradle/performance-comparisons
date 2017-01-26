package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_248 {
    private final Production89_248 production = new Production89_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}