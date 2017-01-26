package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_414 {
    private final Production89_414 production = new Production89_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}