package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_160 {
    private final Production5_160 production = new Production5_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}