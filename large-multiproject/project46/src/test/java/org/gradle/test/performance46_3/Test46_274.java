package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_274 {
    private final Production46_274 production = new Production46_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}