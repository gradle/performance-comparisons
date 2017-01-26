package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_490 {
    private final Production22_490 production = new Production22_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}