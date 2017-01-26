package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_470 {
    private final Production3_470 production = new Production3_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}