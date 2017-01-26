package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_311 {
    private final Production5_311 production = new Production5_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}