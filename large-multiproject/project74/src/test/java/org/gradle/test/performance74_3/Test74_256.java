package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_256 {
    private final Production74_256 production = new Production74_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}