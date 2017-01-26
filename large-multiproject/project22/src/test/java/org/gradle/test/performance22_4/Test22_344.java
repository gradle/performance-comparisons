package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_344 {
    private final Production22_344 production = new Production22_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}