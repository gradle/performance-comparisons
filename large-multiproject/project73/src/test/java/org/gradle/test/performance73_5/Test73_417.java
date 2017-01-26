package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_417 {
    private final Production73_417 production = new Production73_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}