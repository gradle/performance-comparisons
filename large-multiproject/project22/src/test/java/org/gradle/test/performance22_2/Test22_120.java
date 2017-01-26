package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_120 {
    private final Production22_120 production = new Production22_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}