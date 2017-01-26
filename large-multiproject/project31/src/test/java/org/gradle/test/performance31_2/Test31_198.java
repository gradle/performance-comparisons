package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_198 {
    private final Production31_198 production = new Production31_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}