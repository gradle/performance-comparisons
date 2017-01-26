package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_110 {
    private final Production89_110 production = new Production89_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}