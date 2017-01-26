package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_400 {
    private final Production46_400 production = new Production46_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}