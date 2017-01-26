package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_1 {
    private final Production3_1 production = new Production3_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}