package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_198 {
    private final Production92_198 production = new Production92_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}