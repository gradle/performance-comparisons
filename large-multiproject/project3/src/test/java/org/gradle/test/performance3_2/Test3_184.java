package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_184 {
    private final Production3_184 production = new Production3_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}