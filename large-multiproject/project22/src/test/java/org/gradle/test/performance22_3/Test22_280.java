package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_280 {
    private final Production22_280 production = new Production22_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}