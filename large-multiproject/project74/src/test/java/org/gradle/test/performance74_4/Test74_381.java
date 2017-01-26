package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_381 {
    private final Production74_381 production = new Production74_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}