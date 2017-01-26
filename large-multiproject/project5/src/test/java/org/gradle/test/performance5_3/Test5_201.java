package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_201 {
    private final Production5_201 production = new Production5_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}