package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_22 {
    private final Production22_22 production = new Production22_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}