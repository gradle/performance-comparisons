package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_78 {
    private final Production47_78 production = new Production47_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}