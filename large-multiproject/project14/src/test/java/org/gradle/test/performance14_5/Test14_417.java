package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_417 {
    private final Production14_417 production = new Production14_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}