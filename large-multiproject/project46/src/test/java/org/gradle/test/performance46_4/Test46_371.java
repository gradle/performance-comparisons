package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_371 {
    private final Production46_371 production = new Production46_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}