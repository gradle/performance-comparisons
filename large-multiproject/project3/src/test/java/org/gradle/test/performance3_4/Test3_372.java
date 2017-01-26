package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_372 {
    private final Production3_372 production = new Production3_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}