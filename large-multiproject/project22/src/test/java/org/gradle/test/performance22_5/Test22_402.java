package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_402 {
    private final Production22_402 production = new Production22_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}