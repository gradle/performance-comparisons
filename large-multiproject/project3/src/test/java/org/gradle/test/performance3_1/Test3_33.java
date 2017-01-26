package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_33 {
    private final Production3_33 production = new Production3_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}