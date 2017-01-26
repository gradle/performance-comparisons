package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_354 {
    private final Production74_354 production = new Production74_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}