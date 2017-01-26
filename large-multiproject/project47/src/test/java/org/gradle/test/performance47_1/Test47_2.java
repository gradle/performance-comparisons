package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_2 {
    private final Production47_2 production = new Production47_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}