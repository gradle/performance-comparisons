package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_101 {
    private final Production3_101 production = new Production3_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}