package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_362 {
    private final Production47_362 production = new Production47_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}