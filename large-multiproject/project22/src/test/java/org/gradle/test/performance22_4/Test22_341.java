package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_341 {
    private final Production22_341 production = new Production22_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}