package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_36 {
    private final Production3_36 production = new Production3_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}