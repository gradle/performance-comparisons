package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_287 {
    private final Production46_287 production = new Production46_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}