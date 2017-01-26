package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_151 {
    private final Production22_151 production = new Production22_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}