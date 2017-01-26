package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_133 {
    private final Production5_133 production = new Production5_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}