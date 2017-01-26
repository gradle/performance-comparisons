package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_11 {
    private final Production5_11 production = new Production5_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}