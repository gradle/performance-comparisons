package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_403 {
    private final Production22_403 production = new Production22_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}