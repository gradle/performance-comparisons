package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_417 {
    private final Production16_417 production = new Production16_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}