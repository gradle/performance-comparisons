package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_61 {
    private final Production47_61 production = new Production47_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}