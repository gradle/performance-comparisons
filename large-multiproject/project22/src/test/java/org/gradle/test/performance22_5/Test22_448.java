package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_448 {
    private final Production22_448 production = new Production22_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}