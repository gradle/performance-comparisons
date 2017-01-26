package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_231 {
    private final Production47_231 production = new Production47_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}