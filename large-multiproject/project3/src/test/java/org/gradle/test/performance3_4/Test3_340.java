package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_340 {
    private final Production3_340 production = new Production3_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}