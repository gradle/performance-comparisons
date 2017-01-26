package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_185 {
    private final Production89_185 production = new Production89_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}