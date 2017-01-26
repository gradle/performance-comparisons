package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_185 {
    private final Production3_185 production = new Production3_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}