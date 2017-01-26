package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_214 {
    private final Production47_214 production = new Production47_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}