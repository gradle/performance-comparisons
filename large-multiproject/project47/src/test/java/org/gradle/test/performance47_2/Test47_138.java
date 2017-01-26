package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_138 {
    private final Production47_138 production = new Production47_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}