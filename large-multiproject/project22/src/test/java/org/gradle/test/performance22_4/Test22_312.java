package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_312 {
    private final Production22_312 production = new Production22_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}