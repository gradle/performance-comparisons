package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_133 {
    private final Production84_133 production = new Production84_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}