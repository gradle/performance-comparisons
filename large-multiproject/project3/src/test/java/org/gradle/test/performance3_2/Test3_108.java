package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_108 {
    private final Production3_108 production = new Production3_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}