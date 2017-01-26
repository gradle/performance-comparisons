package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_284 {
    private final Production22_284 production = new Production22_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}