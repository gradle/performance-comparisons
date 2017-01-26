package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_37 {
    private final Production3_37 production = new Production3_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}