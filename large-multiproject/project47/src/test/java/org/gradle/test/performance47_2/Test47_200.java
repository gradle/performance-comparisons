package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_200 {
    private final Production47_200 production = new Production47_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}