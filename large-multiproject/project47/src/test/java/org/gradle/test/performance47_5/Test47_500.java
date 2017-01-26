package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_500 {
    private final Production47_500 production = new Production47_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}