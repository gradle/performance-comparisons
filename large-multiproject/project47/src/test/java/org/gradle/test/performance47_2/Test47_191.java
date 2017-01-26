package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_191 {
    private final Production47_191 production = new Production47_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}