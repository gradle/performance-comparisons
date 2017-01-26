package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_417 {
    private final Production43_417 production = new Production43_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}