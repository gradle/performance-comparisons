package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_153 {
    private final Production74_153 production = new Production74_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}