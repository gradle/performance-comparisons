package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_342 {
    private final Production22_342 production = new Production22_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}