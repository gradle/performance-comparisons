package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_428 {
    private final Production22_428 production = new Production22_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}