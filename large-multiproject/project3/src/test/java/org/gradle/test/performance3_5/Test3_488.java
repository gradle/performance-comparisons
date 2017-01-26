package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_488 {
    private final Production3_488 production = new Production3_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}