package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_335 {
    private final Production5_335 production = new Production5_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}