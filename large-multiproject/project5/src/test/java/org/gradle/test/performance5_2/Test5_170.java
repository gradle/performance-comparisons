package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_170 {
    private final Production5_170 production = new Production5_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}