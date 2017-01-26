package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_177 {
    private final Production3_177 production = new Production3_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}