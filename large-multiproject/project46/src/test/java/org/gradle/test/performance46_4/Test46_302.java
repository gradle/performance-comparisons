package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_302 {
    private final Production46_302 production = new Production46_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}