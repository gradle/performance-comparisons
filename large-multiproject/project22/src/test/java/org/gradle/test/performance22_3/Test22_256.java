package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_256 {
    private final Production22_256 production = new Production22_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}