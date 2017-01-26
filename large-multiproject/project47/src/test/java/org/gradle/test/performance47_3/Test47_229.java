package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_229 {
    private final Production47_229 production = new Production47_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}