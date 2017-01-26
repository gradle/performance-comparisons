package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_180 {
    private final Production46_180 production = new Production46_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}