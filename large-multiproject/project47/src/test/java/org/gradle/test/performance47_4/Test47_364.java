package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_364 {
    private final Production47_364 production = new Production47_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}