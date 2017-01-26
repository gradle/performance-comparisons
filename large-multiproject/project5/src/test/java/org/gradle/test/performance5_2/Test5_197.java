package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_197 {
    private final Production5_197 production = new Production5_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}