package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_334 {
    private final Production22_334 production = new Production22_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}