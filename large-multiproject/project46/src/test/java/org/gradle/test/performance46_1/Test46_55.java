package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_55 {
    private final Production46_55 production = new Production46_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}