package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_489 {
    private final Production22_489 production = new Production22_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}