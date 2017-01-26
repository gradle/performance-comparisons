package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_417 {
    private final Production72_417 production = new Production72_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}