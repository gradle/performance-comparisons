package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_417 {
    private final Production25_417 production = new Production25_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}