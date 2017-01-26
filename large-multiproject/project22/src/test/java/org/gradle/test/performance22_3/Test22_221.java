package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_221 {
    private final Production22_221 production = new Production22_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}