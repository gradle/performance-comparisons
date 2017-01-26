package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_92 {
    private final Production3_92 production = new Production3_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}