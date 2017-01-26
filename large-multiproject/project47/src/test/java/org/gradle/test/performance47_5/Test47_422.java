package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_422 {
    private final Production47_422 production = new Production47_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}