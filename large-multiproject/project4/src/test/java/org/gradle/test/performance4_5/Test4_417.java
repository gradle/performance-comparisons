package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_417 {
    private final Production4_417 production = new Production4_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}