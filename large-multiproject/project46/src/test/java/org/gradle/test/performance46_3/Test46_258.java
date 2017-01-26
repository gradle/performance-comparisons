package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_258 {
    private final Production46_258 production = new Production46_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}