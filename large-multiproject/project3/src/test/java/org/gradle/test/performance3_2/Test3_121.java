package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_121 {
    private final Production3_121 production = new Production3_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}