package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_417 {
    private final Production90_417 production = new Production90_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}