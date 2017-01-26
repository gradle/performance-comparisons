package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_385 {
    private final Production3_385 production = new Production3_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}