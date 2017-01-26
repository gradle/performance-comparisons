package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_54 {
    private final Production3_54 production = new Production3_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}