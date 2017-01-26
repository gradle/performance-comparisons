package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_198 {
    private final Production47_198 production = new Production47_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}