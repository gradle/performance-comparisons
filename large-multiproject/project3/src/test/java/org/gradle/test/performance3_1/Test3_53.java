package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_53 {
    private final Production3_53 production = new Production3_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}