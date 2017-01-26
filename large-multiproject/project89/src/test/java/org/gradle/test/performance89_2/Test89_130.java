package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_130 {
    private final Production89_130 production = new Production89_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}