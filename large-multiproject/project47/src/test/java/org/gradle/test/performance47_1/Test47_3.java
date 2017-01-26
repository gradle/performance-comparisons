package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_3 {
    private final Production47_3 production = new Production47_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}