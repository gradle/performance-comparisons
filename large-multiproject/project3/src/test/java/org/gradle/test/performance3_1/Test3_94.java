package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_94 {
    private final Production3_94 production = new Production3_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}