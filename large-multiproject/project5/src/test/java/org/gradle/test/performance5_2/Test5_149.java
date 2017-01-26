package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_149 {
    private final Production5_149 production = new Production5_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}