package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_476 {
    private final Production22_476 production = new Production22_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}