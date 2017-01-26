package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_313 {
    private final Production22_313 production = new Production22_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}