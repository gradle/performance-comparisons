package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_328 {
    private final Production46_328 production = new Production46_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}