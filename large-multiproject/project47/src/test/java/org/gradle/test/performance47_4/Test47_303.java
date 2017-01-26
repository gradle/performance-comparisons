package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_303 {
    private final Production47_303 production = new Production47_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}