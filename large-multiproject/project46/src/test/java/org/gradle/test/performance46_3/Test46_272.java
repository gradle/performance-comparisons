package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_272 {
    private final Production46_272 production = new Production46_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}