package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_23 {
    private final Production46_23 production = new Production46_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}