package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_337 {
    private final Production47_337 production = new Production47_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}