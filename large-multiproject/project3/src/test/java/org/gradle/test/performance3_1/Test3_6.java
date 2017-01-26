package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_6 {
    private final Production3_6 production = new Production3_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}