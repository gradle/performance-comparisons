package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_332 {
    private final Production5_332 production = new Production5_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}