package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_292 {
    private final Production7_292 production = new Production7_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}