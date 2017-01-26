package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_355 {
    private final Production22_355 production = new Production22_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}