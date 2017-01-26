package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_5 {
    private final Production47_5 production = new Production47_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}