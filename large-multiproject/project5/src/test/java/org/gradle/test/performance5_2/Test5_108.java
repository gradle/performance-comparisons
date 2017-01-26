package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_108 {
    private final Production5_108 production = new Production5_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}