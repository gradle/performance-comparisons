package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_135 {
    private final Production47_135 production = new Production47_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}