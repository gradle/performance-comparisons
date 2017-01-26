package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_497 {
    private final Production47_497 production = new Production47_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}