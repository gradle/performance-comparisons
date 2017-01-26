package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_417 {
    private final Production26_417 production = new Production26_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}