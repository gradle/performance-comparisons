package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_179 {
    private final Production22_179 production = new Production22_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}