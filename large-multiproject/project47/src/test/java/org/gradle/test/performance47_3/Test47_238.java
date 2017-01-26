package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_238 {
    private final Production47_238 production = new Production47_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}