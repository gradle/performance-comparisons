package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_417 {
    private final Production81_417 production = new Production81_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}