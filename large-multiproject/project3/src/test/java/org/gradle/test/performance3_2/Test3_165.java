package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_165 {
    private final Production3_165 production = new Production3_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}