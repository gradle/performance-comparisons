package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_338 {
    private final Production47_338 production = new Production47_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}