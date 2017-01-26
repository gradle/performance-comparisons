package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_287 {
    private final Production22_287 production = new Production22_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}