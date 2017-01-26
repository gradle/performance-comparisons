package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_437 {
    private final Production47_437 production = new Production47_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}