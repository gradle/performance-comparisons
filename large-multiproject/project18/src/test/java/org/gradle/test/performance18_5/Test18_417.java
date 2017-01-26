package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_417 {
    private final Production18_417 production = new Production18_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}