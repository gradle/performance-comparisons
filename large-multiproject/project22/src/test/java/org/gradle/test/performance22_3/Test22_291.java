package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_291 {
    private final Production22_291 production = new Production22_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}