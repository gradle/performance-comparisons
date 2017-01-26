package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_368 {
    private final Production5_368 production = new Production5_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}