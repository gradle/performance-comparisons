package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_160 {
    private final Production22_160 production = new Production22_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}