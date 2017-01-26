package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_12 {
    private final Production22_12 production = new Production22_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}