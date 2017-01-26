package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_492 {
    private final Production22_492 production = new Production22_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}