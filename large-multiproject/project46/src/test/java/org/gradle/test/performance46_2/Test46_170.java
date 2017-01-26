package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_170 {
    private final Production46_170 production = new Production46_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}