package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_409 {
    private final Production84_409 production = new Production84_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}