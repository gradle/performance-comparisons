package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_102 {
    private final Production47_102 production = new Production47_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}