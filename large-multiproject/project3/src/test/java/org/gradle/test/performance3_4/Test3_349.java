package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_349 {
    private final Production3_349 production = new Production3_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}