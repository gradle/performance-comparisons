package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_18 {
    private final Production22_18 production = new Production22_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}