package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_487 {
    private final Production22_487 production = new Production22_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}