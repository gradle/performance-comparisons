package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_276 {
    private final Production74_276 production = new Production74_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}