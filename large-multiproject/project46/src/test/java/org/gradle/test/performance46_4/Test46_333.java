package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_333 {
    private final Production46_333 production = new Production46_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}