package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_311 {
    private final Production22_311 production = new Production22_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}