package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_266 {
    private final Production47_266 production = new Production47_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}