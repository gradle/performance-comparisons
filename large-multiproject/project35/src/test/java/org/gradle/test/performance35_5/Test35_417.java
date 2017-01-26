package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_417 {
    private final Production35_417 production = new Production35_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}