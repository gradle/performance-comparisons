package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_17 {
    private final Production22_17 production = new Production22_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}