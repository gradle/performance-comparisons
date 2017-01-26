package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_247 {
    private final Production22_247 production = new Production22_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}