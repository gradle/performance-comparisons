package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_252 {
    private final Production84_252 production = new Production84_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}