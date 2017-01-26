package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_335 {
    private final Production22_335 production = new Production22_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}