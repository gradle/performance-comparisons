package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_417 {
    private final Production8_417 production = new Production8_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}