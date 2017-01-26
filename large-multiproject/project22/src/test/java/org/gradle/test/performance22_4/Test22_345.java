package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_345 {
    private final Production22_345 production = new Production22_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}