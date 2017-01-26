package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_468 {
    private final Production3_468 production = new Production3_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}