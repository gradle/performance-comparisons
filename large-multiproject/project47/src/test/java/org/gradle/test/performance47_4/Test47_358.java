package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_358 {
    private final Production47_358 production = new Production47_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}