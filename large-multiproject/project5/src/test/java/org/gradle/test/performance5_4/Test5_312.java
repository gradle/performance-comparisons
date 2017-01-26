package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_312 {
    private final Production5_312 production = new Production5_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}