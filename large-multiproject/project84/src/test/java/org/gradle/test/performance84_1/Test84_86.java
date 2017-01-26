package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_86 {
    private final Production84_86 production = new Production84_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}