package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_185 {
    private final Production46_185 production = new Production46_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}