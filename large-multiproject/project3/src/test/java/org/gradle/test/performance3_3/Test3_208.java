package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_208 {
    private final Production3_208 production = new Production3_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}