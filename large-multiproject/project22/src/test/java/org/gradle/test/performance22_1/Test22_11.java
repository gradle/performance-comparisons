package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_11 {
    private final Production22_11 production = new Production22_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}