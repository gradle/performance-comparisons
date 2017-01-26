package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_210 {
    private final Production22_210 production = new Production22_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}