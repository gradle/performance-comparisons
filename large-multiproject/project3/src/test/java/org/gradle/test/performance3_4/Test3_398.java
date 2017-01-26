package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_398 {
    private final Production3_398 production = new Production3_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}