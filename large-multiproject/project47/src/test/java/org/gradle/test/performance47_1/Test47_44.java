package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_44 {
    private final Production47_44 production = new Production47_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}