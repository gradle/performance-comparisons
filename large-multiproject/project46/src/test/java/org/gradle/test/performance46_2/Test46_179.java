package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_179 {
    private final Production46_179 production = new Production46_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}