package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_258 {
    private final Production22_258 production = new Production22_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}