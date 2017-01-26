package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_105 {
    private final Production46_105 production = new Production46_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}