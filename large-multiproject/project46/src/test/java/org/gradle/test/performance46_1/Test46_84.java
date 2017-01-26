package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_84 {
    private final Production46_84 production = new Production46_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}