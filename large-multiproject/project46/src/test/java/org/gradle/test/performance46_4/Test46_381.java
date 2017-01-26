package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_381 {
    private final Production46_381 production = new Production46_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}