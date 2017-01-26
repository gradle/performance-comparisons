package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_417 {
    private final Production31_417 production = new Production31_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}