package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_417 {
    private final Production24_417 production = new Production24_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}