package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_169 {
    private final Production22_169 production = new Production22_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}