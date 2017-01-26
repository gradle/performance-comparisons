package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_197 {
    private final Production3_197 production = new Production3_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}