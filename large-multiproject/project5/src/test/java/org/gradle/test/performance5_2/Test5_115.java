package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_115 {
    private final Production5_115 production = new Production5_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}