package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_79 {
    private final Production46_79 production = new Production46_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}