package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_32 {
    private final Production22_32 production = new Production22_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}