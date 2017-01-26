package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_95 {
    private final Production22_95 production = new Production22_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}