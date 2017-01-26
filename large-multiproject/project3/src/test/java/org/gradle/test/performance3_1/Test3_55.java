package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_55 {
    private final Production3_55 production = new Production3_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}