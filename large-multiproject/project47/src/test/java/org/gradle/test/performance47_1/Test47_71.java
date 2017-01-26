package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_71 {
    private final Production47_71 production = new Production47_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}