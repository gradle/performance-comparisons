package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_480 {
    private final Production3_480 production = new Production3_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}