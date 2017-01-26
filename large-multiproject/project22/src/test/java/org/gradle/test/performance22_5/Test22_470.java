package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_470 {
    private final Production22_470 production = new Production22_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}