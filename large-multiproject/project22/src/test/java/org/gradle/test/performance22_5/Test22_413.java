package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_413 {
    private final Production22_413 production = new Production22_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}