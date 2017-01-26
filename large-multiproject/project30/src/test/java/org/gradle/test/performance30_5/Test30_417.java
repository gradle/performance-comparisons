package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_417 {
    private final Production30_417 production = new Production30_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}