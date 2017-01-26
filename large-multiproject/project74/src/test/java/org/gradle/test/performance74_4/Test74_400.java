package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_400 {
    private final Production74_400 production = new Production74_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}