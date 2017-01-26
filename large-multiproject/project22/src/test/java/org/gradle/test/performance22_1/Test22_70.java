package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_70 {
    private final Production22_70 production = new Production22_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}