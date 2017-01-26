package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_384 {
    private final Production22_384 production = new Production22_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}