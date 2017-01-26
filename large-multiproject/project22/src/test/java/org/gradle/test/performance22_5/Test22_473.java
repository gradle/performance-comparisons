package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_473 {
    private final Production22_473 production = new Production22_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}