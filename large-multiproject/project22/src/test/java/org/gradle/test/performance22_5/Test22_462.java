package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_462 {
    private final Production22_462 production = new Production22_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}