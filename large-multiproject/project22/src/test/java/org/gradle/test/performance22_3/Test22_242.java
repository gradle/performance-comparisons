package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_242 {
    private final Production22_242 production = new Production22_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}