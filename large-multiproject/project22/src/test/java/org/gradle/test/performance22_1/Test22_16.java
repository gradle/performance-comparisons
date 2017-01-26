package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_16 {
    private final Production22_16 production = new Production22_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}