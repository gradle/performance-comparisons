package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_417 {
    private final Production46_417 production = new Production46_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}