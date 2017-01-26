package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_417 {
    private final Production49_417 production = new Production49_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}