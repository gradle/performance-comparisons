package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_116 {
    private final Production3_116 production = new Production3_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}