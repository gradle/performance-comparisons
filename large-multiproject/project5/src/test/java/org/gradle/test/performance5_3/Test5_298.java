package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_298 {
    private final Production5_298 production = new Production5_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}