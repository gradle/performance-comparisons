package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_332 {
    private final Production46_332 production = new Production46_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}