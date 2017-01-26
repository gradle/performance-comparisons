package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_316 {
    private final Production22_316 production = new Production22_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}