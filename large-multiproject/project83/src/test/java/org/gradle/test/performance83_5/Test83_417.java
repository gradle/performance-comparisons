package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_417 {
    private final Production83_417 production = new Production83_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}