package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_396 {
    private final Production22_396 production = new Production22_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}