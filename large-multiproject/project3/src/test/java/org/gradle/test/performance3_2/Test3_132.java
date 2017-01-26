package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_132 {
    private final Production3_132 production = new Production3_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}