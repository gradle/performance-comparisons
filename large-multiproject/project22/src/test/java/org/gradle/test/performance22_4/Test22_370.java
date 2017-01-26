package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_370 {
    private final Production22_370 production = new Production22_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}