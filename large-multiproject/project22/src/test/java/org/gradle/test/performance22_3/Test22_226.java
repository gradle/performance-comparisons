package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_226 {
    private final Production22_226 production = new Production22_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}