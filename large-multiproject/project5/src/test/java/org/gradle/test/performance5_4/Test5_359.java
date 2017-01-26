package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_359 {
    private final Production5_359 production = new Production5_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}