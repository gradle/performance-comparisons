package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_414 {
    private final Production22_414 production = new Production22_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}