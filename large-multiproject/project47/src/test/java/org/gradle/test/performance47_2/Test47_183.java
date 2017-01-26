package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_183 {
    private final Production47_183 production = new Production47_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}