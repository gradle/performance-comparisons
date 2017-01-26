package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_206 {
    private final Production22_206 production = new Production22_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}