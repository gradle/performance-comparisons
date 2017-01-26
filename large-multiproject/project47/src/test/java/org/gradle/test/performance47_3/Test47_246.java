package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_246 {
    private final Production47_246 production = new Production47_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}