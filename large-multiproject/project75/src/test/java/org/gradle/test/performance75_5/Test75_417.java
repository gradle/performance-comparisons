package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_417 {
    private final Production75_417 production = new Production75_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}