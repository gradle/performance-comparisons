package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_198 {
    private final Production5_198 production = new Production5_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}