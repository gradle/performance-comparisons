package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_116 {
    private final Production5_116 production = new Production5_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}