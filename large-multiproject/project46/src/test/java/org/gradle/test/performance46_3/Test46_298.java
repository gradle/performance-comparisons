package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_298 {
    private final Production46_298 production = new Production46_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}