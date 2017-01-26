package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_284 {
    private final Production3_284 production = new Production3_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}