package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_417 {
    private final Production40_417 production = new Production40_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}