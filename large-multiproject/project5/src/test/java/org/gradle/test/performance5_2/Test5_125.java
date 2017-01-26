package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_125 {
    private final Production5_125 production = new Production5_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}