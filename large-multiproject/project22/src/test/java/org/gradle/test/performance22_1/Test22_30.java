package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_30 {
    private final Production22_30 production = new Production22_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}