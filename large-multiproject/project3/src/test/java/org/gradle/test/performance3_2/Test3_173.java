package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_173 {
    private final Production3_173 production = new Production3_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}