package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_178 {
    private final Production22_178 production = new Production22_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}