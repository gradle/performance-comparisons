package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_79 {
    private final Production84_79 production = new Production84_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}