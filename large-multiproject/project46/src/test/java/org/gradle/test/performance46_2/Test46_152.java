package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_152 {
    private final Production46_152 production = new Production46_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}