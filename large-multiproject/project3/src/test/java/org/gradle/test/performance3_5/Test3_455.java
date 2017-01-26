package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_455 {
    private final Production3_455 production = new Production3_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}