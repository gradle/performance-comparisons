package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_190 {
    private final Production22_190 production = new Production22_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}