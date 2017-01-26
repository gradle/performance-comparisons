package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_98 {
    private final Production47_98 production = new Production47_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}