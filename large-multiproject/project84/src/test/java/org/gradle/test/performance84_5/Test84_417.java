package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_417 {
    private final Production84_417 production = new Production84_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}