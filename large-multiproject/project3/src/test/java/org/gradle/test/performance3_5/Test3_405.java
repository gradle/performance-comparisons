package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_405 {
    private final Production3_405 production = new Production3_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}