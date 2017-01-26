package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_101 {
    private final Production74_101 production = new Production74_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}