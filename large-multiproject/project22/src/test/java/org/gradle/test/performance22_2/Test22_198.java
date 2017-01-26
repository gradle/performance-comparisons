package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_198 {
    private final Production22_198 production = new Production22_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}