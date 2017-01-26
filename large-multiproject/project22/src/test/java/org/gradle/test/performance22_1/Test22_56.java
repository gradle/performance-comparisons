package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_56 {
    private final Production22_56 production = new Production22_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}