package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_192 {
    private final Production22_192 production = new Production22_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}