package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_133 {
    private final Production74_133 production = new Production74_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}