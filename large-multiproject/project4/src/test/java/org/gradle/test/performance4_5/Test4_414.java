package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_414 {
    private final Production4_414 production = new Production4_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}