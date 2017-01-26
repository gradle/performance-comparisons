package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_130 {
    private final Production22_130 production = new Production22_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}