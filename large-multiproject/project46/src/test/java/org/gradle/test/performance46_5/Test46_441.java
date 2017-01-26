package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_441 {
    private final Production46_441 production = new Production46_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}