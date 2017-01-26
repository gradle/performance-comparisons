package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_198 {
    private final Production84_198 production = new Production84_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}