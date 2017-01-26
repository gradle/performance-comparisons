package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_224 {
    private final Production46_224 production = new Production46_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}