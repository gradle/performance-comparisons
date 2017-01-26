package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_18 {
    private final Production3_18 production = new Production3_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}