package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_381 {
    private final Production22_381 production = new Production22_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}