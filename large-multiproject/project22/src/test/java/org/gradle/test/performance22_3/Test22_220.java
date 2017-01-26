package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_220 {
    private final Production22_220 production = new Production22_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}