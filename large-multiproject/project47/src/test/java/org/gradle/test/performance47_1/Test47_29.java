package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_29 {
    private final Production47_29 production = new Production47_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}