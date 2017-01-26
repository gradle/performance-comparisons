package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_479 {
    private final Production3_479 production = new Production3_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}