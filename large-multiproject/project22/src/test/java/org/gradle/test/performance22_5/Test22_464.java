package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_464 {
    private final Production22_464 production = new Production22_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}