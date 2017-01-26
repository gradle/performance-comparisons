package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_432 {
    private final Production47_432 production = new Production47_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}