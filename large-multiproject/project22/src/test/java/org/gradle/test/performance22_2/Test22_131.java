package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_131 {
    private final Production22_131 production = new Production22_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}