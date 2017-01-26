package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_459 {
    private final Production46_459 production = new Production46_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}