package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_438 {
    private final Production22_438 production = new Production22_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}