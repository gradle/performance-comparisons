package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_197 {
    private final Production74_197 production = new Production74_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}