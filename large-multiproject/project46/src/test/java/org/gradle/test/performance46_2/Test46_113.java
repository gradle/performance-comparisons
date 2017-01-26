package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_113 {
    private final Production46_113 production = new Production46_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}