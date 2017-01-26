package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_66 {
    private final Production47_66 production = new Production47_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}