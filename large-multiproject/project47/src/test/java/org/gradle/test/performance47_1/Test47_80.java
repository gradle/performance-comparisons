package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_80 {
    private final Production47_80 production = new Production47_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}