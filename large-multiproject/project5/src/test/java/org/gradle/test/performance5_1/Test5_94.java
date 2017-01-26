package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_94 {
    private final Production5_94 production = new Production5_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}