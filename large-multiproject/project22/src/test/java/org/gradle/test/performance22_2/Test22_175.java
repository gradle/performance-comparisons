package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_175 {
    private final Production22_175 production = new Production22_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}