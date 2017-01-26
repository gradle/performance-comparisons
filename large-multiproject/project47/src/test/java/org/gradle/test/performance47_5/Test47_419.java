package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_419 {
    private final Production47_419 production = new Production47_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}