package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_467 {
    private final Production22_467 production = new Production22_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}