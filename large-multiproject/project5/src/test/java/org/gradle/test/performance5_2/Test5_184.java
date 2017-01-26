package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_184 {
    private final Production5_184 production = new Production5_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}