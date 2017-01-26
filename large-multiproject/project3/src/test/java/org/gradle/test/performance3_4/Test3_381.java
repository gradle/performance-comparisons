package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_381 {
    private final Production3_381 production = new Production3_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}