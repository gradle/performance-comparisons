package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_163 {
    private final Production3_163 production = new Production3_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}