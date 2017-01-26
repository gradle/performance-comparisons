package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_291 {
    private final Production46_291 production = new Production46_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}