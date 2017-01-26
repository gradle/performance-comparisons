package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_129 {
    private final Production3_129 production = new Production3_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}