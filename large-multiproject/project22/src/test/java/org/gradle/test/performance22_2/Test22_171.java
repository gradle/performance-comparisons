package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_171 {
    private final Production22_171 production = new Production22_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}