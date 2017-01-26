package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_124 {
    private final Production89_124 production = new Production89_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}