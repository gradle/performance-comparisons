package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_250 {
    private final Production5_250 production = new Production5_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}