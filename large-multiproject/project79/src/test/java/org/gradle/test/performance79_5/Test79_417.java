package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_417 {
    private final Production79_417 production = new Production79_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}