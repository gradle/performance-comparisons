package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_417 {
    private final Production92_417 production = new Production92_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}