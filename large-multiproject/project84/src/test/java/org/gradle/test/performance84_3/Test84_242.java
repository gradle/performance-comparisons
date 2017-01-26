package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_242 {
    private final Production84_242 production = new Production84_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}