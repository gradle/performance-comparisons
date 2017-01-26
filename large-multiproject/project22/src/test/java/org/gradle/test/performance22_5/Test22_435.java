package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_435 {
    private final Production22_435 production = new Production22_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}