package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_254 {
    private final Production22_254 production = new Production22_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}