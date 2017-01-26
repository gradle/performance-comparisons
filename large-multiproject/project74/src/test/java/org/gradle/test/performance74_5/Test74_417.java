package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_417 {
    private final Production74_417 production = new Production74_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}