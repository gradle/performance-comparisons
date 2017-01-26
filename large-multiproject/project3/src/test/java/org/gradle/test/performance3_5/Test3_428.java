package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_428 {
    private final Production3_428 production = new Production3_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}