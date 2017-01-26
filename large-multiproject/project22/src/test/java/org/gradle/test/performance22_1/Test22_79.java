package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_79 {
    private final Production22_79 production = new Production22_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}