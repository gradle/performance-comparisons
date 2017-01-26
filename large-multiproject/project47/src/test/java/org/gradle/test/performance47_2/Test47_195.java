package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_195 {
    private final Production47_195 production = new Production47_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}