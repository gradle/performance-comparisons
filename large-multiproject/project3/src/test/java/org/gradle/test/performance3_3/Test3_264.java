package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_264 {
    private final Production3_264 production = new Production3_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}