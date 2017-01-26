package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_306 {
    private final Production3_306 production = new Production3_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}