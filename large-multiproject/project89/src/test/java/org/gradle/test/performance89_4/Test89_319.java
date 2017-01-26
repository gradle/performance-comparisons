package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_319 {
    private final Production89_319 production = new Production89_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}