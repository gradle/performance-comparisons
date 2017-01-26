package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_394 {
    private final Production46_394 production = new Production46_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}