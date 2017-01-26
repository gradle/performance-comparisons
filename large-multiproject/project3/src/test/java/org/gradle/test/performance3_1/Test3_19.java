package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_19 {
    private final Production3_19 production = new Production3_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}