package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_95 {
    private final Production46_95 production = new Production46_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}