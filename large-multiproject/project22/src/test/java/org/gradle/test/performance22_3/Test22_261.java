package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_261 {
    private final Production22_261 production = new Production22_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}