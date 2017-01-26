package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_395 {
    private final Production47_395 production = new Production47_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}