package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_344 {
    private final Production5_344 production = new Production5_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}