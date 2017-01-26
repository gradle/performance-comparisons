package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_110 {
    private final Production58_110 production = new Production58_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}