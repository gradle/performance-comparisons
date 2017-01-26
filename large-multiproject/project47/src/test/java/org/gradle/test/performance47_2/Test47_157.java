package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_157 {
    private final Production47_157 production = new Production47_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}