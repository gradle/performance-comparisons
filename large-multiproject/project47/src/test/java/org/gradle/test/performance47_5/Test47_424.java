package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_424 {
    private final Production47_424 production = new Production47_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}