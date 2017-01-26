package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_110 {
    private final Production4_110 production = new Production4_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}