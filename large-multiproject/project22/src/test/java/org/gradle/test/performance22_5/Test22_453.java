package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_453 {
    private final Production22_453 production = new Production22_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}