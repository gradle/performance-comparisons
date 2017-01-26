package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_228 {
    private final Production47_228 production = new Production47_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}