package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_283 {
    private final Production22_283 production = new Production22_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}