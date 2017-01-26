package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_485 {
    private final Production3_485 production = new Production3_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}