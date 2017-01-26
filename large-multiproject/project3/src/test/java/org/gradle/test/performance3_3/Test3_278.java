package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_278 {
    private final Production3_278 production = new Production3_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}