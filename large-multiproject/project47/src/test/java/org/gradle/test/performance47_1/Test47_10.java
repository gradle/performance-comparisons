package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_10 {
    private final Production47_10 production = new Production47_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}