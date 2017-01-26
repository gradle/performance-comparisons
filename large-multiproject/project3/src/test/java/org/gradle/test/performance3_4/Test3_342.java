package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_342 {
    private final Production3_342 production = new Production3_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}