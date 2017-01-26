package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_192 {
    private final Production74_192 production = new Production74_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}