package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_417 {
    private final Production42_417 production = new Production42_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}