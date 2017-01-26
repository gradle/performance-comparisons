package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_417 {
    private final Production3_417 production = new Production3_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}