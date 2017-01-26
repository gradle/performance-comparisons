package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_116 {
    private final Production22_116 production = new Production22_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}