package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_13 {
    private final Production22_13 production = new Production22_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}