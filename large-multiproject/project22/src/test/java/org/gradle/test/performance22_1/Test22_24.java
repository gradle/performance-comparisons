package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_24 {
    private final Production22_24 production = new Production22_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}