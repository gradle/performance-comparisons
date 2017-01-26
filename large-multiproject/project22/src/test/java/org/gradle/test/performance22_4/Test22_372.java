package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_372 {
    private final Production22_372 production = new Production22_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}