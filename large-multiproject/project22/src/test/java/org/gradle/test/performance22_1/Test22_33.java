package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_33 {
    private final Production22_33 production = new Production22_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}