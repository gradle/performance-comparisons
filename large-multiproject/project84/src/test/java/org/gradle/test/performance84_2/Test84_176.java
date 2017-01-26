package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_176 {
    private final Production84_176 production = new Production84_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}