package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_417 {
    private final Production85_417 production = new Production85_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}