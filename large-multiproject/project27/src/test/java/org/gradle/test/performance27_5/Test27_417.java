package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_417 {
    private final Production27_417 production = new Production27_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}