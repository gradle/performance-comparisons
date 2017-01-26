package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_417 {
    private final Production5_417 production = new Production5_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}