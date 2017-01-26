package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_196 {
    private final Production47_196 production = new Production47_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}