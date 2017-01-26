package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_417 {
    private final Production77_417 production = new Production77_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}