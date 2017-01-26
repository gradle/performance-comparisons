package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_118 {
    private final Production22_118 production = new Production22_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}