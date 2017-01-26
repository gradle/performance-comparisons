package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_480 {
    private final Production22_480 production = new Production22_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}