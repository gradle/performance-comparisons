package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_240 {
    private final Production5_240 production = new Production5_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}