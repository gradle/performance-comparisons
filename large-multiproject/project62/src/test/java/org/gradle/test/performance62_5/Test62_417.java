package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_417 {
    private final Production62_417 production = new Production62_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}