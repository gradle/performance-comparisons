package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_490 {
    private final Production3_490 production = new Production3_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}