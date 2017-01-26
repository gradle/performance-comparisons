package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_299 {
    private final Production22_299 production = new Production22_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}