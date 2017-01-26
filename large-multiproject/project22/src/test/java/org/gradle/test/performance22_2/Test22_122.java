package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_122 {
    private final Production22_122 production = new Production22_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}