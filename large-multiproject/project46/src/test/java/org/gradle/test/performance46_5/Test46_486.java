package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_486 {
    private final Production46_486 production = new Production46_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}