package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_23 {
    private final Production22_23 production = new Production22_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}