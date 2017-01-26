package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_201 {
    private final Production3_201 production = new Production3_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}