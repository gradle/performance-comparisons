package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_170 {
    private final Production84_170 production = new Production84_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}