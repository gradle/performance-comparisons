package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_443 {
    private final Production22_443 production = new Production22_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}