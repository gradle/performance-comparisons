package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_411 {
    private final Production22_411 production = new Production22_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}