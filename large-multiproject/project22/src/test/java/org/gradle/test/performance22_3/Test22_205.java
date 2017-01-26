package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_205 {
    private final Production22_205 production = new Production22_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}