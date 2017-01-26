package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_161 {
    private final Production3_161 production = new Production3_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}