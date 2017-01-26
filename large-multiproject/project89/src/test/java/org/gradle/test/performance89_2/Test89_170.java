package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_170 {
    private final Production89_170 production = new Production89_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}