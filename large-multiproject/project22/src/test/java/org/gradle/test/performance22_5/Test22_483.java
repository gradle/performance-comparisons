package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_483 {
    private final Production22_483 production = new Production22_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}