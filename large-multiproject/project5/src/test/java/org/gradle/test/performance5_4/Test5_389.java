package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_389 {
    private final Production5_389 production = new Production5_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}