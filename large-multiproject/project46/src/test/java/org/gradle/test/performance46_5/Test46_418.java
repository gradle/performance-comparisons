package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_418 {
    private final Production46_418 production = new Production46_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}