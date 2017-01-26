package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_17 {
    private final Production46_17 production = new Production46_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}