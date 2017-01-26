package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_290 {
    private final Production46_290 production = new Production46_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}