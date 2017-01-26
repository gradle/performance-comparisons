package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_217 {
    private final Production3_217 production = new Production3_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}