package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_348 {
    private final Production22_348 production = new Production22_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}