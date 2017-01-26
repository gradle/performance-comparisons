package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_375 {
    private final Production22_375 production = new Production22_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}