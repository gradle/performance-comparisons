package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_198 {
    private final Production4_198 production = new Production4_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}