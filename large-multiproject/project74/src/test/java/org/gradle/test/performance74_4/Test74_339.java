package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_339 {
    private final Production74_339 production = new Production74_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}