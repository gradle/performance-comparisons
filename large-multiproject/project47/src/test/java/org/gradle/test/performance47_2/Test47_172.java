package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_172 {
    private final Production47_172 production = new Production47_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}