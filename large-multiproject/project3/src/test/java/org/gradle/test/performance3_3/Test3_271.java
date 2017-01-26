package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_271 {
    private final Production3_271 production = new Production3_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}