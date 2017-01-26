package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_417 {
    private final Production94_417 production = new Production94_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}