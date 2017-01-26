package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_312 {
    private final Production46_312 production = new Production46_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}