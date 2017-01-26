package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_339 {
    private final Production3_339 production = new Production3_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}