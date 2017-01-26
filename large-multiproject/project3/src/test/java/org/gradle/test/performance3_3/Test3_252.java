package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_252 {
    private final Production3_252 production = new Production3_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}