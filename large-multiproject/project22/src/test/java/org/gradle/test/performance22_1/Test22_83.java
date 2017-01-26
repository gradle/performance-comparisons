package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_83 {
    private final Production22_83 production = new Production22_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}