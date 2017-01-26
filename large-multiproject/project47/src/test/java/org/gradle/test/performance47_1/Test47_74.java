package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_74 {
    private final Production47_74 production = new Production47_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}