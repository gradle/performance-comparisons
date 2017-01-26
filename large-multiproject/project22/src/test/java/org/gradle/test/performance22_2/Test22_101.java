package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_101 {
    private final Production22_101 production = new Production22_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}