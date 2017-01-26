package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_438 {
    private final Production74_438 production = new Production74_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}