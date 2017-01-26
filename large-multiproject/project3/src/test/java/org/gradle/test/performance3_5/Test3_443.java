package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_443 {
    private final Production3_443 production = new Production3_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}