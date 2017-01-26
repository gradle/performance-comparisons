package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_124 {
    private final Production5_124 production = new Production5_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}