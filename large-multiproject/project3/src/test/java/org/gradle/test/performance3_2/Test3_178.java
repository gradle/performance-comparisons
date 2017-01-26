package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_178 {
    private final Production3_178 production = new Production3_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}