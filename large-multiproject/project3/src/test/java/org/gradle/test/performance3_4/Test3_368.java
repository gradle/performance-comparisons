package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_368 {
    private final Production3_368 production = new Production3_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}