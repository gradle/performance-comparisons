package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_292 {
    private final Production93_292 production = new Production93_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}