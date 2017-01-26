package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_456 {
    private final Production46_456 production = new Production46_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}