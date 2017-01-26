package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_373 {
    private final Production3_373 production = new Production3_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}