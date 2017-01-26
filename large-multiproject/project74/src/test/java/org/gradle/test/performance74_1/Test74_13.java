package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_13 {
    private final Production74_13 production = new Production74_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}