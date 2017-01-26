package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_197 {
    private final Production89_197 production = new Production89_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}