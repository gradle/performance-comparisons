package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_224 {
    private final Production3_224 production = new Production3_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}