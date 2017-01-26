package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_113 {
    private final Production22_113 production = new Production22_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}