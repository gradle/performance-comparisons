package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_19 {
    private final Production22_19 production = new Production22_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}