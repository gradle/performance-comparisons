package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_356 {
    private final Production47_356 production = new Production47_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}