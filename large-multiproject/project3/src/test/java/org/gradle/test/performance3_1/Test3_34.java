package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_34 {
    private final Production3_34 production = new Production3_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}