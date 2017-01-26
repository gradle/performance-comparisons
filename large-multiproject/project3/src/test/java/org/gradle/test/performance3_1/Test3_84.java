package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_84 {
    private final Production3_84 production = new Production3_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}