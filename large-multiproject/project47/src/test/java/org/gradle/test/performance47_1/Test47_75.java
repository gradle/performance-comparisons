package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_75 {
    private final Production47_75 production = new Production47_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}