package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_141 {
    private final Production5_141 production = new Production5_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}