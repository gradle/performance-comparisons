package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_415 {
    private final Production3_415 production = new Production3_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}