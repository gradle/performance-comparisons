package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_132 {
    private final Production5_132 production = new Production5_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}