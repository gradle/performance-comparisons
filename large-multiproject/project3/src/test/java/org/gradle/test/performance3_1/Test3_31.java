package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_31 {
    private final Production3_31 production = new Production3_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}