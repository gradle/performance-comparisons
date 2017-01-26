package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_69 {
    private final Production22_69 production = new Production22_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}