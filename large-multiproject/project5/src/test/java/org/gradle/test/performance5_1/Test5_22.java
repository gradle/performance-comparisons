package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_22 {
    private final Production5_22 production = new Production5_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}