package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_408 {
    private final Production22_408 production = new Production22_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}