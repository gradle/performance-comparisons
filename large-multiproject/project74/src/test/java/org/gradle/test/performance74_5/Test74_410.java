package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_410 {
    private final Production74_410 production = new Production74_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}