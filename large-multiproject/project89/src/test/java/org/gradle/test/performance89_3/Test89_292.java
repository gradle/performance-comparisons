package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_292 {
    private final Production89_292 production = new Production89_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}