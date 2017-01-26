package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_256 {
    private final Production5_256 production = new Production5_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}