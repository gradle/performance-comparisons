package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_301 {
    private final Production89_301 production = new Production89_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}