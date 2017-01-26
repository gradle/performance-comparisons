package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_401 {
    private final Production22_401 production = new Production22_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}