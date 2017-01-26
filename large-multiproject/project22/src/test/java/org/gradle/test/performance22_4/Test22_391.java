package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_391 {
    private final Production22_391 production = new Production22_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}