package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_256 {
    private final Production3_256 production = new Production3_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}