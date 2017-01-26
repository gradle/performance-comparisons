package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_139 {
    private final Production22_139 production = new Production22_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}