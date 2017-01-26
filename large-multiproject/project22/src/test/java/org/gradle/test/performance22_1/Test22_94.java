package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_94 {
    private final Production22_94 production = new Production22_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}