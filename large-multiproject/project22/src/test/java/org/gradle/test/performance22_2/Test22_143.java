package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_143 {
    private final Production22_143 production = new Production22_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}