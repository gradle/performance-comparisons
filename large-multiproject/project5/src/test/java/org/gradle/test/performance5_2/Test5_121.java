package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_121 {
    private final Production5_121 production = new Production5_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}