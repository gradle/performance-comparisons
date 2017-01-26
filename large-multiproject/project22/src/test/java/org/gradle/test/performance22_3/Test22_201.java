package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_201 {
    private final Production22_201 production = new Production22_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}