package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_417 {
    private final Production17_417 production = new Production17_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}