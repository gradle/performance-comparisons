package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_424 {
    private final Production22_424 production = new Production22_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}