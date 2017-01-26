package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_182 {
    private final Production22_182 production = new Production22_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}