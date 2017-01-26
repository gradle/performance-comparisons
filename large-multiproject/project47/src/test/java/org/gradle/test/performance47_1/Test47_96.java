package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_96 {
    private final Production47_96 production = new Production47_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}