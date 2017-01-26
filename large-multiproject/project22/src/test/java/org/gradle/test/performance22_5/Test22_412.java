package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_412 {
    private final Production22_412 production = new Production22_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}