package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_417 {
    private final Production15_417 production = new Production15_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}