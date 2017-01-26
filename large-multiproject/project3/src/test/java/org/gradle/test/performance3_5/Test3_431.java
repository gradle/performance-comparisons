package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_431 {
    private final Production3_431 production = new Production3_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}