package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_493 {
    private final Production22_493 production = new Production22_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}