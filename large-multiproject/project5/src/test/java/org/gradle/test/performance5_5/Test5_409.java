package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_409 {
    private final Production5_409 production = new Production5_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}