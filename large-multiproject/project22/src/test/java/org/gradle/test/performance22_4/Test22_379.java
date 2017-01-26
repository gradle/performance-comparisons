package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_379 {
    private final Production22_379 production = new Production22_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}