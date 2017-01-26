package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_417 {
    private final Production7_417 production = new Production7_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}