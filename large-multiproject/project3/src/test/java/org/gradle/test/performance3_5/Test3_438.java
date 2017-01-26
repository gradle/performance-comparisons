package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_438 {
    private final Production3_438 production = new Production3_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}