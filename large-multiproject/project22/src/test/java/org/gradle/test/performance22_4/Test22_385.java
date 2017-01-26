package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_385 {
    private final Production22_385 production = new Production22_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}