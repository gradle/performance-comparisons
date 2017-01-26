package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_86 {
    private final Production3_86 production = new Production3_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}