package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_100 {
    private final Production47_100 production = new Production47_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}