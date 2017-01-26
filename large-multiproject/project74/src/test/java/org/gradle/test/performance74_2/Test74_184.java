package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_184 {
    private final Production74_184 production = new Production74_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}