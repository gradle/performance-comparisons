package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_176 {
    private final Production46_176 production = new Production46_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}