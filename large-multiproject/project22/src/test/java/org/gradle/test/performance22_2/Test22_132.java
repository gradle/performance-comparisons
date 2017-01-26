package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_132 {
    private final Production22_132 production = new Production22_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}