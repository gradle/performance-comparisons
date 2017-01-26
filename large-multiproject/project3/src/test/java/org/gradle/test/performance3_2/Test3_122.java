package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_122 {
    private final Production3_122 production = new Production3_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}