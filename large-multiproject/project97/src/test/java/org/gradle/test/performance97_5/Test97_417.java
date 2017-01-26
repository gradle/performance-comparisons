package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_417 {
    private final Production97_417 production = new Production97_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}