package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_495 {
    private final Production47_495 production = new Production47_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}