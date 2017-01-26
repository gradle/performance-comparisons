package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_385 {
    private final Production46_385 production = new Production46_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}