package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_223 {
    private final Production22_223 production = new Production22_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}