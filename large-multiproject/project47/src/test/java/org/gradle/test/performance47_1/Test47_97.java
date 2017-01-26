package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_97 {
    private final Production47_97 production = new Production47_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}