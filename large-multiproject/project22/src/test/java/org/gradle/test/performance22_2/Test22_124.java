package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_124 {
    private final Production22_124 production = new Production22_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}