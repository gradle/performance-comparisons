package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_391 {
    private final Production3_391 production = new Production3_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}