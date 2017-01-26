package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_417 {
    private final Production63_417 production = new Production63_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}