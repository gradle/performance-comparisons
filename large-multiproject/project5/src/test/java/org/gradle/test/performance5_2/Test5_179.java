package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_179 {
    private final Production5_179 production = new Production5_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}