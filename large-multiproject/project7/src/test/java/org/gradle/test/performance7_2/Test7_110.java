package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_110 {
    private final Production7_110 production = new Production7_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}