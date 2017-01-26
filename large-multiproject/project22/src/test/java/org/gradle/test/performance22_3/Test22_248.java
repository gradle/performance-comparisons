package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_248 {
    private final Production22_248 production = new Production22_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}