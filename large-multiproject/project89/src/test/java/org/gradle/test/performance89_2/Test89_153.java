package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_153 {
    private final Production89_153 production = new Production89_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}