package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_59 {
    private final Production22_59 production = new Production22_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}