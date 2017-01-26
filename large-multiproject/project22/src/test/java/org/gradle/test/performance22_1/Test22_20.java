package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_20 {
    private final Production22_20 production = new Production22_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}