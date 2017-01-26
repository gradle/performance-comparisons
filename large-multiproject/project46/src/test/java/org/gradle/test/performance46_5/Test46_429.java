package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_429 {
    private final Production46_429 production = new Production46_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}