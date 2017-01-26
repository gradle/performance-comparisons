package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_391 {
    private final Production5_391 production = new Production5_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}