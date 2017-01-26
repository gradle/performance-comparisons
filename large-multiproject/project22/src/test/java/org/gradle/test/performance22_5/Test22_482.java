package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_482 {
    private final Production22_482 production = new Production22_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}