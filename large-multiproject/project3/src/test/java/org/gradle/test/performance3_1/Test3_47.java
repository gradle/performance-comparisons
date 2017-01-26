package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_47 {
    private final Production3_47 production = new Production3_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}