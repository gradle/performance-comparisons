package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_158 {
    private final Production46_158 production = new Production46_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}