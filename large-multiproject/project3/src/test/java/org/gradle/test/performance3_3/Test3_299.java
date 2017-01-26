package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_299 {
    private final Production3_299 production = new Production3_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}