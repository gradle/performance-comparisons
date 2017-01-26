package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_412 {
    private final Production84_412 production = new Production84_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}