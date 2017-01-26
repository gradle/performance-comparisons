package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_417 {
    private final Production11_417 production = new Production11_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}