package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_316 {
    private final Production5_316 production = new Production5_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}