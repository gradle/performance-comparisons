package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_417 {
    private final Production50_417 production = new Production50_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}