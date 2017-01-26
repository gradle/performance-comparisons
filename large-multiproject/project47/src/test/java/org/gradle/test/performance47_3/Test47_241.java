package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_241 {
    private final Production47_241 production = new Production47_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}