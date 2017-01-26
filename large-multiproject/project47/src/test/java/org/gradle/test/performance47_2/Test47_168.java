package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_168 {
    private final Production47_168 production = new Production47_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}