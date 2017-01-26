package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_174 {
    private final Production3_174 production = new Production3_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}