package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_332 {
    private final Production22_332 production = new Production22_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}