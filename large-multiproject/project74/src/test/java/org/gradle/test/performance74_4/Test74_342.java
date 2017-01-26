package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_342 {
    private final Production74_342 production = new Production74_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}