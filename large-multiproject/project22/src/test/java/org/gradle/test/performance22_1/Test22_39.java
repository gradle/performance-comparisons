package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_39 {
    private final Production22_39 production = new Production22_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}