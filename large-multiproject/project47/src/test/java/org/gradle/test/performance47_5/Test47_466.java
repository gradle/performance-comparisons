package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_466 {
    private final Production47_466 production = new Production47_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}