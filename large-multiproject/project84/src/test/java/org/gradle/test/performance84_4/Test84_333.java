package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_333 {
    private final Production84_333 production = new Production84_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}