package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_250 {
    private final Production22_250 production = new Production22_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}