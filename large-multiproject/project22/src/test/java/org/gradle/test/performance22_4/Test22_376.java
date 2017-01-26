package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_376 {
    private final Production22_376 production = new Production22_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}