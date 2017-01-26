package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_94 {
    private final Production46_94 production = new Production46_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}