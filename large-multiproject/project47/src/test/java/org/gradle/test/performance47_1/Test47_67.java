package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_67 {
    private final Production47_67 production = new Production47_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}