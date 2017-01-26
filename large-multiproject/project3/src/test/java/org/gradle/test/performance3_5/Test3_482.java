package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_482 {
    private final Production3_482 production = new Production3_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}