package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_158 {
    private final Production84_158 production = new Production84_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}