package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_345 {
    private final Production74_345 production = new Production74_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}