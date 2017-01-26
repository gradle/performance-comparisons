package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_499 {
    private final Production22_499 production = new Production22_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}