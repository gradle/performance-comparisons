package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_417 {
    private final Production60_417 production = new Production60_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}