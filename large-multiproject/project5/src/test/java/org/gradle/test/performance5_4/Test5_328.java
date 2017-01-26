package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_328 {
    private final Production5_328 production = new Production5_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}