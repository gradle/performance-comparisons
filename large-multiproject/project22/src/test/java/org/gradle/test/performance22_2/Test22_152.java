package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_152 {
    private final Production22_152 production = new Production22_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}