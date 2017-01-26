package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_410 {
    private final Production22_410 production = new Production22_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}