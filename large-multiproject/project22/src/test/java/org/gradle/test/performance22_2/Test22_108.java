package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_108 {
    private final Production22_108 production = new Production22_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}