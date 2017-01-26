package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_250 {
    private final Production3_250 production = new Production3_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}