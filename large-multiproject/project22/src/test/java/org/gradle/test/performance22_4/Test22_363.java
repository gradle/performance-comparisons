package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_363 {
    private final Production22_363 production = new Production22_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}