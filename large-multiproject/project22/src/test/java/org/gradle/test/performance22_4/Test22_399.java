package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_399 {
    private final Production22_399 production = new Production22_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}