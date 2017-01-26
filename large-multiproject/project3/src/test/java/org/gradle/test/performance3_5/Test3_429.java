package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_429 {
    private final Production3_429 production = new Production3_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}