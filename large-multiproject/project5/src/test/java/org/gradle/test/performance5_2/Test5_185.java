package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_185 {
    private final Production5_185 production = new Production5_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}